package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    private String name, address, color;
    private int age, weight;

    public Cat(String name) {
        this.name = name;
        this.color = "red";
        this.age = 3;
        this.weight = 5;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.color = "grey";
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.color = "black";
        this.age = age;
        this.weight = 10;
    }

    public Cat(int weight, String color) {
        this.color = color;
        this.age = 7;
        this.weight = weight;
    }

    public Cat(int weight, String color, String address) {
        this.address = address;
        this.color = color;
        this.age = 11;
        this.weight = weight;
    }

    public static void main(String[] args) {

    }
}
