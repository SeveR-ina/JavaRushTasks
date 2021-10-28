package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String path1;
        String path2;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            path1 = reader.readLine();
            path2 = reader.readLine();
        }
        ArrayList<Integer> list = new ArrayList<>();
        try (FileReader fileReader = new FileReader(path1)) {
            while (fileReader.ready()) {
                list.add(fileReader.read());
            }
        }
        try (FileWriter fileWriter = new FileWriter(path2)) {
            for (int i = 1; i < list.size(); i = i + 2) {
                fileWriter.write(list.get(i));
            } //(byte) (int)
        }

    }
}
