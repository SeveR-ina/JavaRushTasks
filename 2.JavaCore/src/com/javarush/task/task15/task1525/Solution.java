package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static List<String> lines = new ArrayList<>();

    static {
        String s;
        try {
            FileReader fr = new FileReader(Statics.FILE_NAME);
            BufferedReader br = new BufferedReader(fr);
            while ((s = br.readLine()) != null) {
                lines.add(s);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
