package com.javarush.task.task18.task1817;

import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int spacesCount = 0;
        int symbolCount = 0;
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                int charFile = fileReader.read();
                symbolCount++;
                if (charFile == (int) ' ') spacesCount++;
            }
        }
        System.out.format("%.2f", (double) spacesCount / symbolCount * 100);
    }
}
