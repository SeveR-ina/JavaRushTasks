package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное число
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());
        int s = sum(x) + sum(y) + sum(z);
        System.out.println(s);
    }

    public static boolean isMoreThanZero(int n) {
        return (n > 0);
    }

    public static int sum(int n) {
        int s = 0;
        if (isMoreThanZero(n)) {
            s = s + 1;
        }
        return s;
    }
}
