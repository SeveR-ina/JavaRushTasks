package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        if (isNumberInVariety(x)) {
            String result = nameIsNumberDividedOnTwo(x) + " " + nameHowMuchNumbers(x) + " " + "число";
            System.out.println(result);
        }
    }

    public static String nameHowMuchNumbers(int n) {
        String number = null;
        if ((n > 0) && (n < 10)) {
            number = "однозначное";
        } else if ((n >= 10) && (n < 100)) {
            number = "двузначное";
        } else if ((n >= 100) && (n < 1000)) {
            number = "трехзначное";
        }
        return number;
    }

    public static boolean isNumberInVariety(int n) {
        return ((n >= 1) && (n <= 999));
    }

    public static String nameIsNumberDividedOnTwo(int n) {
        String number;
        if (n % 2 == 0) {
            number = "четное";
        } else {
            number = "нечетное";
        }
        return number;
    }

}
