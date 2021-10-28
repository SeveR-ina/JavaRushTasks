package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        double n1 = number / 100;
        int intn1 = (int)n1; // 5
        int intn2 = number - (intn1 * 100);
        double n2 = intn2 / 10;
        int intn3 = (int)n2; // 4
        int n3 = number - (intn1 * 100 + intn3 * 10);
        return intn1 + intn3 + n3;
    }
}