package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> map = new TreeMap<>();
        try (BufferedReader file = new BufferedReader(new FileReader(args[0]))) {
            String line;
            String[] lines;
            double salaryVal;
            while ((file.ready())) {
                lines = file.readLine().split(" ");
                String name = lines[0];
                salaryVal = Double.parseDouble(lines[1]);
                Double newSalaryVal;
                if (map.containsKey(name)) {
                    newSalaryVal = map.get(name);
                    map.put(name, salaryVal + newSalaryVal);
                } else {
                    map.put(name, salaryVal);
                }
            }
        }
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
