package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Выражаемся покороче
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        ArrayList<String> list1 = initializeArray(5);
        int index = getIndex(list1);
        ArrayList<String> list2 = getListTwo(list1, index);

        for (int i = 1; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }

    public static ArrayList<String> initializeArray(int loopCount) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < loopCount; i++) {
            String s = reader.readLine();
            list1.add(s);
        }
        return list1;
    }

    public static int getIndex(ArrayList<String> list1) {
        int index = 0;
        int count = list1.get(0).length();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).length() < count) {
                count = list1.get(i).length();
                index = i;
            }
        }
        return index;
    }

    public static ArrayList<String> getListTwo(ArrayList<String> list1, int index) {
        ArrayList<String> list2 = new ArrayList<>();
        list2.add(list1.get(index));
        for (String s : list1) {
            if (s.length() < list2.get(0).length()) {
                list2.add(0, s);

            } else if (s.length() == list2.get(0).length()) {
                list2.add(s);
            }
        }
        return list2;
    }
}
