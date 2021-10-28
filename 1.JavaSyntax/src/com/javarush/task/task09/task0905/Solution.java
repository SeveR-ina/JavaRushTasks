package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();
        int count = 0;
        for (StackTraceElement info : methods) {
            if (!info.getMethodName().equals(null)){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}

