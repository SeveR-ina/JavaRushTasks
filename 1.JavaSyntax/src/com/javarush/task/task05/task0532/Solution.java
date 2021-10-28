package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n <= 0) return;
        int maximum = Integer.parseInt(reader.readLine());
        for (int i = n; i > 1; i--)
            maximum = Math.max(Integer.parseInt(reader.readLine()), maximum);
        System.out.println(maximum);
    
    }
}
