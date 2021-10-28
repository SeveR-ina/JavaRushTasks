package com.javarush.task.task07.task0715;

import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    //public static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "мама", "мыла", "раму");
        addNewWord("мама", list);
        addNewWord("мыла", list);
        addNewWord("раму", list);
        print(list);
    }

    public static void addNewWord(String s, ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(s)) {
                list.add(i + 1, "именно");
            }
        }
    }

    public static void print(ArrayList<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }
}
