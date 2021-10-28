package com.javarush.task.task15.task1521;

import java.math.BigDecimal;

/* 
ООП. Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        //Блок 2.
        //Вызов для Object
        new Tree().info(Integer.valueOf("4"));
        new Tree().info(Short.valueOf("4"));
        new Tree().info(new BigDecimal("4"));

        //Блок 3.
        //Вызов для Number
        new Tree().info(Integer.valueOf("4"));
        new Tree().info(Short.valueOf("4"));
        new Tree().info(new BigDecimal("4"));

        //Блок 4.
        //Вызов для String
        new Tree().info("4");
        new Tree().info(Integer.valueOf("4").toString());
        new Tree().info(Short.valueOf("4").toString());
        new Tree().info(new BigDecimal("4").toString());
    }
}
