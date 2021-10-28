package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        String s = "8";
        for (int l = 1; l < 11; l++) {
            System.out.println(s);
            s = s + "8";
        }
    }
}

