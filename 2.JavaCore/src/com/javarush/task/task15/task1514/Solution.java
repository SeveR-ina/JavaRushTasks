package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    static Map<Double, String> labels = new HashMap<>();

    static {
        labels.put(0.5, "0.5");
        labels.put(0.7, "0.7");
        labels.put(0.9, "0.9");
        labels.put(1.1, "1.1");
        labels.put(1.3, "1.3");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
