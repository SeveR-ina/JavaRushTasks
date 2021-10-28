package com.javarush.task.task33.task3303;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
//import com.fasterxml.jackson.annotation.JsonAutoDetect;

/* 
Десериализация JSON объекта
*/

public class Solution {
    public static <T> T convertFromJsonToNormal(String fileName, Class<T> clazz) throws IOException {
        return new ObjectMapper().readValue(new File(fileName), clazz);
    }

    public static void main(String[] args) throws IOException {
        /*String fileName = "C:\\Users\\cherr\\Documents\\10000000\\json.txt";
        Shark newShark = convertFromJsonToNormal(fileName, Shark.class);
        System.out.println(newShark.first_name);
        System.out.println(newShark.last_name);
        System.out.println(newShark.location);
        System.out.println(newShark.online);
        System.out.println(newShark.followers);*/
    }

    /*@JsonAutoDetect
    public static class Shark {
        public String first_name;
        public String last_name;
        public String location;
        public boolean online;
        public int followers;

    }*/
}
