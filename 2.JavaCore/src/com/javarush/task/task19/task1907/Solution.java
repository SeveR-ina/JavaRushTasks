package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        String path;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            path = br.readLine();
        }
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(path)) {
            char c;
            while (fileReader.ready()) {
                c = (char) fileReader.read();
                stringBuilder.append(c);
            }
        }
        String replacedString = stringBuilder.toString().replaceAll("\\p{P}", " ").replaceAll("\\s", " ");
        for (String x : replacedString.split(" ")) {
            if (x.equals("world")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
