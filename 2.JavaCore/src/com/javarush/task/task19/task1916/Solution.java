package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        String path1;
        String path2;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            path1 = reader.readLine();
            path2 = reader.readLine();
        }
        List<String> oldFile = new ArrayList<>();
        List<String> newFile = new ArrayList<>();
        String line;
        try (BufferedReader reader1 = new BufferedReader(new FileReader(path1));
             BufferedReader reader2 = new BufferedReader(new FileReader(path2))) {
            while ((line = reader1.readLine()) != null) {
                oldFile.add(line);
            }
            while ((line = reader2.readLine()) != null) {
                newFile.add(line);
            }
        }
        int oldFileLine = 0;
        int newFileLine = 0;
        while ((oldFileLine < oldFile.size()) && (newFileLine < newFile.size())) {
            if (oldFile.get(oldFileLine).equals(newFile.get(newFileLine))) {
                lines.add(new LineItem(Type.SAME, oldFile.get(oldFileLine)));
                oldFileLine++;
                newFileLine++;
            } else if ((newFileLine + 1 < newFile.size()) && oldFile.get(oldFileLine).equals(newFile.get(newFileLine + 1))) {
                lines.add(new LineItem(Type.ADDED, newFile.get(newFileLine)));
                newFileLine++;
            } else if ((oldFileLine + 1 < oldFile.size()) && oldFile.get(oldFileLine + 1).equals(newFile.get(newFileLine))) {
                lines.add(new LineItem(Type.REMOVED, oldFile.get(oldFileLine)));
                oldFileLine++;
            }
        }
        while (oldFileLine < (oldFile.size())) {
            lines.add(new LineItem(Type.REMOVED, oldFile.get(oldFileLine)));
            oldFileLine++;
        }
        while (newFileLine < (newFile.size())) {
            lines.add(new LineItem(Type.ADDED, newFile.get(newFileLine)));
            newFileLine++;
        }
    }

    public enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
