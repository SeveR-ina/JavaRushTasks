package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = "";
        ArrayList<String> list = new ArrayList<>();
        //C:\Users\cherr\Documents\Lion.avi.part1
        //C:\Users\cherr\Documents\Lion.avi.part2
        //C:\Users\cherr\Documents\Lion.avi.
        try {
            while (!filename.equals("end")) {
                filename = reader.readLine();
                list.add(filename);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(list);
        filename = list.get(0).substring(0, list.get(0).lastIndexOf("."));
        try (FileOutputStream out = new FileOutputStream(filename)) {
            for (String s : list) {
                if (!s.equals("end")) {
                    try (FileInputStream in = new FileInputStream(s)) {
                        byte[] buffer = new byte[in.available()];
                        while (in.available() > 0) {
                            int bytesRead = in.read(buffer);
                            out.write(buffer, 0, bytesRead);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
