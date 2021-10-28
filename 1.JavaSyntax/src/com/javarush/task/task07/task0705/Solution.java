package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] listBig = new int[20];

        for (int i = 0; i < listBig.length; i++) {
            String s = reader.readLine();
            listBig[i] = Integer.parseInt(s);
        }

        int[] list1 = new int[10];
        int[] list2 = new int[10];
        int k = 0;
        for (int i = 0; i < listBig.length - 10; i++) {
            list1[i] = listBig[i];
            k = i;
        }
        for (int i = 0; i < listBig.length - 10; i++) {
            list2[i] = listBig[k + 1];
            k = k + 1;
            System.out.println(list2[i]);
        }
    }
}
