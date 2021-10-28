package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> newList = new ArrayList<>();
        for (String string : strings) {
            if (string.contains("л")) {
                if (string.contains("р"))
                    newList.add(string);
                else {
                    newList.add(string);
                    newList.add(string);
                }
            } else {
                if (!string.contains("р"))
                    newList.add(string);
            }
        }
        return newList;
    }
}