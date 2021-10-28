package com.javarush.task.task08.task0807;

import java.util.ArrayList;
import java.util.LinkedList;

/* 
LinkedList и ArrayList
*/

public class Solution {
    public static Object createArrayList() {
        //статическая инициализация массива
        int[] numbers = {1, 5, 6, 11, 3, 15, 7, 8};
        ArrayList<Integer> list = new ArrayList<>();
        //заполнение списка из массива
        for (int number : numbers) list.add(number);
        return list;
    }

    public static Object createLinkedList() {
        //статическая инициализация массива
        int[] numbers = {15, 7, 8};
        LinkedList<Integer> list = new LinkedList<>();
        //заполнение списка из массива
        for (int number : numbers) list.add(number);
        return list;
    }

    public static void main(String[] args) {

    }
}
