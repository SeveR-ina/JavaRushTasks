package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {

    public static void main(String[] args) {
        Cat vasya = new Cat("Vasya", 1, 1, 2);
        Cat fluffy = new Cat("Fluffy", 5, 7, 5);
        Cat proshka = new Cat("Proshka", 3, 5, 3);
        System.out.println(vasya.fight(proshka));
        System.out.println(vasya.fight(fluffy));
        System.out.println(fluffy.fight(proshka));
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
