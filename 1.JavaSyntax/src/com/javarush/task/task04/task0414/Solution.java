package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        int viYear = 366;
        int neviYear = 365;
        if (year % 400 == 0) {
            System.out.println("количество дней в году: " + viYear);
        }
        else if (year % 100 == 0) {
            System.out.println("количество дней в году: " + neviYear);
        }
        else if (year % 4 == 0) {
            System.out.println("количество дней в году: " + viYear);
        }
        else {
            System.out.println("количество дней в году: " + neviYear);
        }

    }
}