package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int min(int x, int y) {
        if (x < y) {
            return x;
        } else if (x > y) {
            return y;
        }
        return 0;
    }

    public static long min(long x, long y) {
        if (x < y) {
            return x;
        } else if (x > y) {
            return y;
        }
        return 0;
    }

    public static double min(double x, double y) {
        if (x < y) {
            return x;
        } else if (x > y) {
            return y;
        }
        return 0;
    }
}
