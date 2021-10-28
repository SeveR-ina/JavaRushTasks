package com.javarush.task.task31.task3102;

import java.io.File;
import java.util.*;

/* 
Находим все файлы
*/

public class Solution {
    public static List<String> getFileTree(String root) {
        List<String> res = new ArrayList<>();
        Queue<File> queue = new LinkedList<>();
        File rootDir = new File(root);
        if (rootDir.isDirectory())
            queue.add(rootDir);
        while (!queue.isEmpty()) {
            File path = queue.poll();
            for (File file : path.listFiles()) {
                if (file.isDirectory()) {
                    queue.add(file);
                } else {
                    res.add(file.getAbsolutePath());
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String root = "C:\\Users\\cherr\\Videos";
        List<String> res = getFileTree(root);
        for (String path : res) {
            System.out.println(path);
        }
    }
}
