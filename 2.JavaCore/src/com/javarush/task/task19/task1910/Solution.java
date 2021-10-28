package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String path1;
        String path2;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            path1 = reader.readLine();
            path2 = reader.readLine();
        }

        ArrayList<String> strings = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path1))) {
            while (bufferedReader.ready()) {
                strings.add(bufferedReader.readLine());
            }
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path2))) {
            for (String line : strings) {
                bufferedWriter.write(line.replaceAll("\\p{P}|\\n", ""));
            }
        }

    }
}
