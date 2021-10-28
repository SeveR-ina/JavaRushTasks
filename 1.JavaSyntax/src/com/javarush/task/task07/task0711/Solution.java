package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = 0;
        //int k2 = 0;
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
            k = i;
        }
        int k2 = 0;
        for (int i = 0; i < 13; i++) {
            String s = list.get(k);
            list.remove(k);
            list.add(i - k2, s);
            k2 = k2 + 1;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));  //3 4 5 1 2
        }
    }
}
