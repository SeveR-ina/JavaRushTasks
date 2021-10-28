package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine()); // 0
        int y = Integer.parseInt(reader.readLine()); // 0
        int z = Integer.parseInt(reader.readLine()); // 10
        if ((x >= y) && (x >= z)) {
            if (y >= z) {
                System.out.println(x + " " + y + " " + z);
            }
            else {
                System.out.println(x + " " + z + " " + y);
            }
        }
        else if ((y >= x) && (y >= z)) {
            if (x >= z) {
                System.out.println(y + " " + x + " " + z);
            }
            else {
                System.out.println(y + " " + z + " " + x);
            }
        }
        else if ((z >= x) && (z >= y)) {
            if (x >= y) {
                System.out.println(z + " " + x + " " + y);
            }
            else {
                System.out.println(z + " " + y + " " + x);
            }
        }
    }
}
