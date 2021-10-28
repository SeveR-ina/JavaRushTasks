package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String profession;
        private int age;
        private int height;
        private int weight;
        private boolean isMale;

        public Human() {

        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, String profession, int age) {
            this.name = name;
            this.profession = profession;
            this.age = age;
        }

        public Human(String name, int age, boolean isMale) {
            this.name = name;
            this.age = age;
            this.isMale = isMale;
        }

        public Human(String name, int weight, int height) {
            this.name = name;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, String profession, int age, int height, int weight) {
            this.name = name;
            this.profession = profession;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, int age, int weight, int height) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String profession, boolean isMale) {
            this.profession = profession;
            this.isMale = isMale;
        }

        public Human(String profession, int height, boolean isMale, String name) {
            this.profession = profession;
            this.height = height;
            this.isMale = isMale;
            this.name = name;
        }

    }
}
