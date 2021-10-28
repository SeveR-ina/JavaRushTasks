package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputPath = reader.readLine();
        String outputPath = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(inputPath);
        FileOutputStream fileOutputStream = new FileOutputStream(outputPath);
        List<Integer> inputBytes = new ArrayList<>();
        while (fileInputStream.available() > 0) {
            inputBytes.add(fileInputStream.read());
        }
        fileInputStream.close();
        Collections.reverse(inputBytes);
        for (Integer aByte : inputBytes) {
            fileOutputStream.write(aByte);
        }
        fileOutputStream.close();
    }
}
