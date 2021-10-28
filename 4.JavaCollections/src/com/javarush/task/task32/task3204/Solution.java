package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;

/* 
Генератор паролей
*/

public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        ByteArrayOutputStream array = new ByteArrayOutputStream();
        StringBuilder password = new StringBuilder();
        int length = 8;
        String randomCharacters = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < length - 2; i++) {
            password.append(getRandomCharacter(randomCharacters));
        }
        String randomNumber = getRandomCharacter("0123456789");
        String randomBigCharacters = getRandomCharacter("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        password = new StringBuilder(getRandomString(password.toString(), randomNumber));
        password = new StringBuilder(getRandomString(password.toString(), randomBigCharacters));
        byte[] bytes = password.toString().getBytes();
        for (byte b : bytes) {
            array.write(b);
        }
        return array;
    }

    public static String getRandomCharacter(String characters) {
        int n = characters.length();
        int r = (int) (n * Math.random());
        return characters.substring(r, r + 1);
    }

    public static String getRandomString(String str, String strForInsert) {
        int n = str.length();
        int position = (int) ((n + 1) * Math.random()); //+1 cause substring - end-1
        return str.substring(0, position) + strForInsert + str.substring(position);
    }
}
