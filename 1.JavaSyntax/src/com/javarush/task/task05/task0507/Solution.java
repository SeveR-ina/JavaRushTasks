package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];
        int i = 0, n = 0;
        double sr, sum = 0;
        while(true) {
            list[i] = Integer.parseInt(reader.readLine());
            if(list[i] == -1) {
                break;
            }
            else {sum = list[i] + sum;
            }


            i++ ; n++;
        }
        sr = sum/n;
        System.out.println(sr);

    }
}

