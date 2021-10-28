package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother);

        String grandpaName = reader.readLine();
        //Cat catGrandPa = new Cat();

        System.out.println(catMother);
        System.out.println(catDaughter);
    }
    /*The cat's name is дедушка Вася, no mother, no father
    The cat's name is бабушка Мурка, no mother, no father
    The cat's name is папа Котофей, no mother, father is дедушка Вася
    The cat's name is мама Василиса, mother is бабушка Мурка, no father
    The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
    The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
    The cat's name is мама, no mother
    The cat's name is доча, mother is мама
    */

    public static class Cat {
        private final String name;
        private Cat parent;
        

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent) {
            this.name = name;
            this.parent = parent;
        }

        @Override
        public String toString() {
            if (parent == null)
                return "The cat's name is " + name + ", no mother ";
            else
                return "The cat's name is " + name + ", mother is " + parent.name;
        }
    }

}
