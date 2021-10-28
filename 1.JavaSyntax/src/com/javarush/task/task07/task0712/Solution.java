package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static int indexShortest = 0;
    public static int indexLongest = 0;

    public static void main(String[] args) throws IOException {
        ArrayList<String> mainList = initializeArray(10);
        setIndexes(mainList);
        ArrayList<String> resultingList = getListTwo(mainList);
        System.out.println(resultingList.get(0));
    }

    public static ArrayList<String> initializeArray(int loopCount) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < loopCount; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        return list;
    }

    public static void setIndexes(ArrayList<String> list1) {
        int s = list1.get(0).length();
        int s2 = list1.get(0).length();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).length() < s) {
                s = list1.get(i).length();
                if (s2 < s) {
                    s2 = s;
                }
                indexShortest = i;
            } else if (list1.get(i).length() > s2) {
                s2 = list1.get(i).length();
                indexLongest = i;
            }
        }
    }

    public static ArrayList<String> getListTwo(ArrayList<String> mainList) {
        ArrayList<String> resultingList = new ArrayList<>();
        if (indexShortest < indexLongest) {
            resultingList.add(mainList.get(indexShortest));
        } else {
            resultingList.add(mainList.get(indexLongest));
        }
        return resultingList;
    }
}
