package com.javarush.task.task31.task3101;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;
import java.util.Map;
import java.util.TreeMap;

/* 
Проход по дереву файлов
*/

public class Solution {
    public static void main(String[] args) {
        //C:\Users\cherr\Documents
        //C:\Users\cherr\Documents\1.txt
        String path = args[0];
        File resultFileAbsolutePath = new File(args[1]);
        File allFilesContent = new File(resultFileAbsolutePath.getParent()
                + "/allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, allFilesContent);
        Map<String, byte[]> fileTree = getFileTree(path);
        try (FileOutputStream outputStream = new FileOutputStream(allFilesContent)) {
            for (byte[] bytes : fileTree.values()) {
                outputStream.write(bytes);
                outputStream.write("\n".getBytes());
            }
        } catch (IOException ignored) {
        }
    }

    public static Map<String, byte[]> getFileTree(String root) {
        Map<String, byte[]> result = new TreeMap<>();
        EnumSet<FileVisitOption> options = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
        try {
            Files.walkFileTree(Paths.get(root), options, 20, new GetFiles(result));
        } catch (IOException ignored) {
        }
        return result;
    }

    private static class GetFiles extends SimpleFileVisitor<Path> {
        private Map<String, byte[]> result;

        public GetFiles(Map<String, byte[]> result) {
            this.result = result;
        }

        @Override
        public FileVisitResult visitFile(Path path, BasicFileAttributes
                basicFileAttributes)
                throws IOException {
            File file = path.toFile();
            if (file.isFile()) {
                if (file.length() <= 50) {
                    result.put(path.getFileName().toString(), Files.readAllBytes(path));
                }
            }
            return super.visitFile(path, basicFileAttributes);
        }
    }

}
