package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();
        System.out.println(methods[2].getClassName() + ": " + methods[2].getMethodName() + ": " + text);
    }
}
