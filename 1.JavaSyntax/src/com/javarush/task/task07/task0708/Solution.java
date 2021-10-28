package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);
        }
        int index = getIndex(strings);
        ArrayList<String> list = getList(strings, index);
        for (int i = 1; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    /*public static ArrayList<String> initializeArray(int loopCount) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < loopCount; i++) {
            String s = reader.readLine();
            list1.add(s);
        }
        return list1;
    }*/

    public static int getIndex(ArrayList<String> strings) {
        int index = 0;
        int s = strings.get(0).length();
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > s) {
                s = strings.get(i).length();
                index = i;
            }
        }
        return index;
    }

    public static ArrayList<String> getList(ArrayList<String> strings, int index) {
        ArrayList<String> list = new ArrayList<>();
        list.add(strings.get(index));
        for (String s : strings) {
            if (s.length() > list.get(0).length()) {
                list.add(0, s);

            } else if (s.length() == list.get(0).length()) {
                list.add(s);
            }
        }
        return list;
    }

}
