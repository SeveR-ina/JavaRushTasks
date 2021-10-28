package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();
        return methods[2].getMethodName();
    }

    public static String method2() {
        method3();
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();
        return methods[2].getMethodName();
    }

    public static String method3() {
        method4();
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();
        return methods[2].getMethodName();
    }

    public static String method4() {
        method5();
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();
        return methods[2].getMethodName();
    }

    public static String method5() {
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();
        return methods[2].getMethodName();
    }
}
