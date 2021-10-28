package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(10);
        set.add(11);
        set.add(3);
        set.add(4);
        set.add(12);
        set.add(13);
        set.add(5);
        set.add(6);
        set.add(14);
        set.add(7);
        set.add(30);
        set.add(8);
        set.add(9);
        set.add(33);
        set.add(53);
        set.add(61);
        set.add(140);
        set.add(0);
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set<Integer> copy = new HashSet<>(set);
        for (Integer number : copy) {
            if (number > 10) {
                set.remove(number);
            }
        }
        return copy;
    }

    public static void main(String[] args) {

    }
}
