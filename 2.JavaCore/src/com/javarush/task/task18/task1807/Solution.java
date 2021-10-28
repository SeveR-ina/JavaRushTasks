package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        FileInputStream inputStream = new FileInputStream(path);
        long sum = 0;
        //byte[] buffer = new byte[1000];
        while (inputStream.available() > 0) {
            if (inputStream.read() == 44) {
                sum = sum + 1;
            }
        }
        inputStream.close();
        System.out.println(sum);
    }
}
