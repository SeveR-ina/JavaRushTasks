package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        while (i < 5) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
            i++;
        }
        list.remove(2);
        Collections.reverse(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
