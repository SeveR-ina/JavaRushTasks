package com.javarush.task.task35.task3511;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* 
Wildcards для коллекций
*/

public class Solution {

    public static void main(String[] args) {
/*        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        System.out.println("sum = " + sum(list));
        System.out.println("multiply = " + multiply(list));
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello ");
        stringList.add("World");
        System.out.println("concat = " + concat(stringList));
        System.out.println("combine = " + combine(Collections.singletonList(stringList)));*/
    }

    public static Double sum(List<? extends Number> list) {
        Double result = 0.0;
        for (Number num : list) {
            result += num.doubleValue();
        }
        return result;
    }

    public static Double multiply(List<? extends Number> list) {
        Double result = 1.0;
        for (Number num : list) {
            result *= num.doubleValue();
        }
        return result;
    }

    public static String concat(List<?> list) {
        StringBuilder builder = new StringBuilder();
        for (Object obj : list) {
            builder.append(obj);
        }
        return builder.toString();
    }

    public static List combine(List<? extends Collection> list) {
        List result = new ArrayList<>();
        for (Collection collection : list) {
            result.addAll(collection);
        }
        return result;
    }
}
