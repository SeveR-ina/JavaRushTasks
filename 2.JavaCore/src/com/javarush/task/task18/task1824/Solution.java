package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String path = reader.readLine();
            try (FileInputStream ignored = new FileInputStream(path)) {
            } catch (FileNotFoundException e) {
                System.out.println(path);
                break;
            }
        }
    }
}
