package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/

public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) throw new TooShortStringException();
        String[] tmp = string.split("\t");
        if (tmp.length < 3) throw new TooShortStringException();
        return tmp[1];
        /*int tabOneIndex = string.indexOf("\t");
        int tabSecIndex = string.indexOf("\t", 1);
        return string.substring(tabOneIndex + 1, tabSecIndex);*/
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
