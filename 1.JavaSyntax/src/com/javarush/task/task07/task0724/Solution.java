package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human woman1 = new Human("Regina", true, 58);
        Human man1 = new Human("Paul", false, 55);
        Human woman2 = new Human("Lauryn", true, 68);
        Human man2 = new Human("Eric", false, 65);
        Human woman3 = new Human("Daniella", true, 28, man1, woman1);
        Human man3 = new Human("Tyrone", true, 18, man1, woman1);
        Human woman4 = new Human("Rebecca", true, 24, man2, woman2);
        Human man5 = new Human("Bryce", true, 30, man2, woman2);
        Human man6 = new Human("Alex", true, 18, man1, woman2);
        System.out.println(woman1.toString());
        System.out.println(man1.toString());
        System.out.println(woman2.toString());
        System.out.println(man2.toString());
        System.out.println(woman3.toString());
        System.out.println(man3.toString());
        System.out.println(woman4.toString());
        System.out.println(man5.toString());
        System.out.println(man6.toString());

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father, mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}