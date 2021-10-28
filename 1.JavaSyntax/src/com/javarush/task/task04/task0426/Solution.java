package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a == 0) {
            System.out.println("ноль");
        } else if (dividesByTwo(a)) {
            if (isLessThanZero(a)) {
                System.out.println("отрицательное четное число");
            } else {
                System.out.println("положительное четное число");
            }
        } else {
            if (isLessThanZero(a)) {
                System.out.println("отрицательное нечетное число");
            } else {
                System.out.println("положительное нечетное число");
            }
        }
    }

    public static boolean dividesByTwo(int a) {
        return (a % 2 == 0);
    }

    public static boolean isLessThanZero(int a) {
        return (a < 0);
    }
}
