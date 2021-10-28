package com.javarush.task.task18.task1816;

import java.io.*;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //C:\Users\cherr\Documents\1.txt
        File file = new File(args[0]);
        int count = 0;
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            while (fileInputStream.available() > 0) {
                int i = fileInputStream.read();
                if ((i >= (int) 'A' && i <= (int) 'Z') || (i >= (int) 'a' && i <= (int) 'z')) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}