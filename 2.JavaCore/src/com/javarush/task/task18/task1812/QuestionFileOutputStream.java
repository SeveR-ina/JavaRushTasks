package com.javarush.task.task18.task1812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {

    private AmigoOutputStream amigoOutputStream;
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public QuestionFileOutputStream(AmigoOutputStream outputStream) {
        this.amigoOutputStream = outputStream;
    }

    @Override
    public void flush() throws IOException {
        this.amigoOutputStream.flush();
    }

    @Override
    public void write(int b) throws IOException {
        this.amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        this.amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        this.amigoOutputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        String line = bufferedReader.readLine();
        if (line.equals("Д"))
            this.amigoOutputStream.close();
        else
            return;
    }
}

