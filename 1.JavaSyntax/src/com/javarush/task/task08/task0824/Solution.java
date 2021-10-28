package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human("Валентин", true, 18);
        Human child2 = new Human("Регина", false, 20);
        Human child3 = new Human("Владислав", true, 13);
        Human dad = new Human("Наиль", true, 38, child1, child2, child3);
        Human mom = new Human("Александра", false, 37, child1, child2, child3);
        Human grandDad1 = new Human("Юрий", true, 69, dad);
        Human grandMom1 = new Human("Надежда", false, 65, dad);
        Human grandDad2 = new Human("Александр", true, 75, mom);
        Human grandMom2 = new Human("Анна", false, 72, mom);
        System.out.println(grandDad1);
        System.out.println(grandMom1);
        System.out.println(grandDad2);
        System.out.println(grandMom2);
        System.out.println(dad);
        System.out.println(mom);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        List<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            Collections.addAll(this.children, children);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
