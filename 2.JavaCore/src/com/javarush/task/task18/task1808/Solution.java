package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        String outputFile1 = reader.readLine();
        String outputFile2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(inputFile);
        FileOutputStream outputStream1 = new FileOutputStream(outputFile1);
        FileOutputStream outputStream2 = new FileOutputStream(outputFile2);

        int count = (inputStream.available() + 1) / 2;
        int i = 0;
        while (inputStream.available() > 0) {
            if (i < count) outputStream1.write(inputStream.read());
            else outputStream2.write(inputStream.read());
            i++;
        }

        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
