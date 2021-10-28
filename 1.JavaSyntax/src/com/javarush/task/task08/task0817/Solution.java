package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> map2 = new HashMap<>(map);
        for (String name : map2.values()) {
            int count = 0;
            for (String nameTmp : map.values()) {
                if (nameTmp.equals(name)) {
                    count++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, name);
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> map2 = new HashMap<>(map);
        for (Map.Entry<String, String> pair : map2.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
