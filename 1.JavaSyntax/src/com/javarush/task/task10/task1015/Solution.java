package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] array = new ArrayList[5];
        array[0] = new ArrayList<>();
        array[1] = new ArrayList<>();
        array[2] = new ArrayList<>();
        array[3] = new ArrayList<>();
        array[4] = new ArrayList<>();
        array[0].add("Привет");
        array[1].add("Как дела?");
        array[2].add("Что нового?");
        array[3].add("Чем занят?");
        array[4].add("Какие планы?");
        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}