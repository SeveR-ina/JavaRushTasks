package com.javarush.task.task30.task3012;

/* 
Получи заданное число
*/

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.createExpression(74);
    }

    public void createExpression(int number) {
        StringBuilder sb = new StringBuilder(number + " =");
        int i = 0; //счетчик для числа 3
        do {
            int j = number % 3;
            number = number / 3;
            if (j == 1) sb.append(" + " + (int) Math.pow(3, i));
            if (j == 2) {
                sb.append(" - " + (int) Math.pow(3, i));
                number++;
            }
            i++;
        } while (number > 0);
        System.out.println(sb.toString());
    }
}