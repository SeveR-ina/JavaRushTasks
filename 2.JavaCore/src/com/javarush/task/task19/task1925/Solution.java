package com.javarush.task.task19.task1925;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //(?<![A-z])[A-z]{7,}(?![A-z])|(?<![А-я])[A-я]{7,}(?![А-я])
        ArrayList<String> words = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        String newS = "";
        int indexOfLastLongWord;
        try (BufferedReader file = new BufferedReader(new FileReader(args[0]));
             FileWriter fileWriter = new FileWriter(args[1])) {
            while (file.ready()) {
                String line = file.readLine();
                words.addAll(Arrays.asList(line.split(" ")));
            }
            for (String word : words) {
                if (word.length() > 6) {
                    s.append(word).append(",");
                }
            }
            indexOfLastLongWord = s.lastIndexOf(",");
            newS = s.deleteCharAt(indexOfLastLongWord).toString();
            fileWriter.write(newS);
        }
    }
}
