package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("DECEMBER 13 2013"));
        map.put("Комаров", dateFormat.parse("MARCH 5 2010"));
        map.put("Ливанов", dateFormat.parse("JANUARY 23 2011"));
        map.put("Васильев", dateFormat.parse("MAY 5 2012"));
        map.put("Михайлов", dateFormat.parse("DECEMBER 17 2016"));
        map.put("Астафьев", dateFormat.parse("APRIL 16 2009"));
        map.put("Алексеев", dateFormat.parse("JUNE 7 2011"));
        map.put("Лавинов", dateFormat.parse("APRIL 26 2010"));
        map.put("Петров", dateFormat.parse("JUNE 4 2017"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> copy = new HashMap<>(map);
        for (String key : copy.keySet()) {
            Date date = copy.get(key);
            int month = date.getMonth() + 1;
            if (month == 6 || month == 7 || month == 8) {
                map.remove(key);
            }
        }
    }

    public static void main(String[] args) {

    }
}
