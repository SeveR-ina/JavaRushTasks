package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static int sum1 = 0; //кол-во отриц.чисел
    public static int sum2 = 0; //кол-во пол.чисел

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());
        sum(x);
        sum(y);
        sum(z);
        System.out.println("количество отрицательных чисел: " + sum1);
        System.out.println("количество положительных чисел: " + sum2);
    }

    public static boolean isLessThanZero(int n) {
        return (n < 0);
    }

    public static void sum(int n) {
        if (isLessThanZero(n)) {
            sum1 = sum1 + 1;
        } else if (!isLessThanZero(n)) {
            if (n > 0) {
                sum2 = sum2 + 1;
            }
        }
    }
}
