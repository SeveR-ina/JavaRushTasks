package com.javarush.task.task31.task3107;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 
Null Object Pattern
*/

public class Solution {
    private FileData fileData;

    public Solution(String pathToFile) {
        try {
            Path path = Paths.get(pathToFile);
            boolean isDirectory = Files.isDirectory(path);
            boolean isHidden = Files.isHidden(path);
            boolean isWritable = Files.isWritable(path);
            boolean isExecutable = Files.isExecutable(path);
            fileData = new ConcreteFileData(isHidden, isExecutable, isDirectory, isWritable);
        } catch (Exception e) {
            fileData = new NullFileData(e);
        }
    }

    public FileData getFileData() {
        return fileData;
    }
}
