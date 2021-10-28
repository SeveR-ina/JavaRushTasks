package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Александр");
        map.put("Петров", "Евгений");
        map.put("Сидоров", "Валентин");
        map.put("Крылов", "Олег");
        map.put("Гаврилов", "Владимир");
        map.put("Петров", "Сергей");
        map.put("Лаврентьев", "Евгений");
        map.put("Васильев", "Дмитрий");
        map.put("Титов", "Олег");
        map.put("Громова", "Софья");
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
