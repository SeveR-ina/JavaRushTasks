package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        map.put("Вася", new Cat("Вася"));
        map.put("Проша", new Cat("Проша"));
        map.put("Кузя", new Cat("Кузя"));
        map.put("Пушистик", new Cat("Пушистик"));
        map.put("Лютик", new Cat("Лютик"));
        map.put("Дилан", new Cat("Дилан"));
        map.put("Усатый", new Cat("Усатый"));
        map.put("Милочка", new Cat("Милочка"));
        map.put("Хрюша", new Cat("Хрюша"));
        map.put("Филя", new Cat("Филя"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
