package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());
        if (x == y && x == z) {
            System.out.println(x + " " + y + " " + z);
        } else if (x == z) {
            System.out.println(x + " " + z);
        } else if (y == z) {
            System.out.println(y + " " + z);
        } else if (x == y) {
            System.out.println(x + " " + y);
        }
    }
}