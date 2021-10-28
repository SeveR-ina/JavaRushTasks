package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = -1;
        for (; true; ) {
            int x = Integer.parseInt(reader.readLine());
            if (x == -1) {
                break;
            }
            sum = sum + x;
        }
        System.out.println(sum);
    }
}
