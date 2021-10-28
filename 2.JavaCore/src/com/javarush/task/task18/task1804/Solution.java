package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine(); //D:\\1.txt

        FileInputStream fileInputStream = new FileInputStream(path);
        int[] bytesCount = new int[255]; //127+128
        while (fileInputStream.available() > 0) {
            bytesCount[fileInputStream.read()] += 1;
        }
        fileInputStream.close();
        int minCount = Integer.MAX_VALUE;
        for (int byteCount : bytesCount) {
            if (byteCount > 0 && byteCount < minCount) minCount = byteCount;
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < bytesCount.length; i++) {
            if (bytesCount[i] == minCount) resultList.add(i);
        }
        for (Integer resultItem : resultList) System.out.print(resultItem + " ");
    }
}

