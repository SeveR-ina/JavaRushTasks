package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<String, Double> map = new HashMap<>();
        try (BufferedReader file = new BufferedReader(new FileReader(args[0]))) {
            String line;
            String[] lines;
            double salaryVal;
            while ((line = file.readLine()) != null) {
                lines = line.split(" ");
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
        Double maxValueInMap = (Collections.max(map.values()));
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue().equals(maxValueInMap)) {
                System.out.println(entry.getKey());
            }
        }
    }
}

