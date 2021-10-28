package com.javarush.task.task12.task1207;

/* 
Int и Integer
*/

public class Solution {
    public static void main(String[] args) {
        print(10);
        print(Integer.valueOf(20));
    }

    public static void print(int x) {
        System.out.println(x);
    }

    public static void print(Integer n) {
        System.out.println(n);
    }
}
