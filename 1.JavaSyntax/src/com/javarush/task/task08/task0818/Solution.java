package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("иванов", 50000);
        map.put("петров", 55000);
        map.put("сидоров", 70000);
        map.put("крылов", 45000);
        map.put("гаврилов", 75000);
        map.put("белов", 400);
        map.put("филлипов", 70000);
        map.put("васильев", 43000);
        map.put("вавилов", 65000);
        map.put("громова", 100);
        return map;

    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            //String key = pair.getKey();            //ключ
            Integer value = pair.getValue();        //значение
            if (value < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}