package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/

public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        //out.close();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.stream = new FileOutputStream(fileName, true);
        //in.close();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\cherr\\Documents\\1.txt";
        Solution s = new Solution(path);
        String write1 = "REGINA HEY!";
        s.writeObject(write1);
        FileOutputStream outputStream = new FileOutputStream(path);
        ObjectOutputStream ous = new ObjectOutputStream(outputStream);
        ous.writeObject(s);
        ous.close();
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fileInputStream);
        Solution s1 = (Solution) ois.readObject();
        String write2 = "HOW ARE YOU?";
        s1.writeObject(write2);
        s1.close();
        try (BufferedReader file = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = file.readLine()) != null) {
                if (line.contains(write1) || line.contains(write2)) {
                    System.out.println("file contains our strings");
                    return;
                } else {
                    System.out.println("file doesn't contain our strings");
                }
            }
        }
    }
}
