package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int x;
    public static int even = 0;
    public static int odd = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(reader.readLine());
        sum(x);
        System.out.println("Even: " + even + " Odd: " + odd);
    }

    public static void sum(int x) {
        int lastDigit;
        while (x > 0) {
            lastDigit = x % 10;
            if (lastDigit % 2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }
            x /= 10;
        }
    }
}
