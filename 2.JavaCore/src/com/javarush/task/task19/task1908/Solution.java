package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String path1;
        String path2;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            path1 = bufferedReader.readLine();
            path2 = bufferedReader.readLine();
        }

        ArrayList<String> strings = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path1))) {
            while (bufferedReader.ready()) {
                strings.add(bufferedReader.readLine());
            }
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path2))) {
            for (String line : strings) {
                String[] s = line.trim().split(" ");
                for (String word : s) {
                    try {
                        int num = Integer.parseInt(word);
                        bufferedWriter.write(word + " ");
                    } catch (Exception ignore) {
                    }
                }
            }
        }
    }
}

