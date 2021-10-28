package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    //public static int AGE = 18;
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age1 = Integer.parseInt(reader.readLine());
        if (age1 < 18) {
            System.out.println("Подрасти еще");
        }
        else {

        }
    }
}
