package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Александр");
        map.put("Петров", "Евгений");
        map.put("Сидоров", "Валентин");
        map.put("Крылов", "Георгий");
        map.put("Гаврилов", "Владимир");
        map.put("Белов", "Сергей");
        map.put("Лаврентьев", "Евгений");
        map.put("Васильев", "Дмитрий");
        map.put("Титов", "Олег");
        map.put("Громова", "Софья");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (String value : map.values()) {
            if (value.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (String key : map.keySet()) {
            if (key.equals(lastName)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
