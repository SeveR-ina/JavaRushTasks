package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[15];
        int sum1 = 0; //chet
        int sum2 = 0; //nechetniye
        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
            if (i % 2 == 0) {
                sum1 = sum1 + list[i];
            } else {
                sum2 = sum2 + list[i];
            }
        }
        /*System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);*/
        if (sum1 > sum2) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
