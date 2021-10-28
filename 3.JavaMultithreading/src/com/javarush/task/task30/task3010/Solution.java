package com.javarush.task.task30.task3010;

import java.math.BigInteger;

/* 
Минимальное допустимое основание системы счисления
*/

public class Solution {
    public static void main(String[] args) {
        try {
            for (int i = 2; i <= 36; i++) {
                try {
                    new BigInteger(args[0], i);
                    System.out.println(i);
                    return;
                } catch (Exception e) {
                }
            }
            System.out.println("incorrect");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}