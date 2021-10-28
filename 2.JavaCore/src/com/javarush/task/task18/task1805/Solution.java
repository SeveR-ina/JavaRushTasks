package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine(); //D:\\1.txt
        FileInputStream fileInputStream = new FileInputStream(path);
        ArrayList<Integer> resultList = new ArrayList<>();
        while (fileInputStream.available() > 0) {
            resultList.add(fileInputStream.read());
        }
        fileInputStream.close();
        Set<Integer> set = new HashSet<>(resultList);
        resultList.clear();
        resultList.addAll(set);
        Collections.sort(resultList);
        for (Integer resultItem : resultList) System.out.print(resultItem + " ");
    }
}
