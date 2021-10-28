package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> gList = new ArrayList<>();
        ArrayList<Integer> trList = new ArrayList<>();
        ArrayList<Integer> twList = new ArrayList<>();
        ArrayList<Integer> etcList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            gList.add(Integer.parseInt(s));
        }
        for (Integer integer : gList) {
            if (integer % 3 == 0 && integer % 2 == 0) {
                trList.add(integer);
                twList.add(integer);
            } else if (integer % 3 == 0) {
                trList.add(integer);
            } else if (integer % 2 == 0) {
                twList.add(integer);
            } else {
                etcList.add(integer);
            }
        }
        printList(trList);
        printList(twList);
        printList(etcList);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
