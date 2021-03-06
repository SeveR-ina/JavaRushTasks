package com.javarush.task.task12.task1219;

/* 
Создаем человека
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }
            /* Пингвин должен уметь плавать и бегать.
            7. Самолет должен уметь летать и ездить. */

    public class Human implements CanRun, CanSwim {

        public void run() {
        }

        public void swim() {
        }
    }

    public class Duck implements CanRun, CanSwim, CanFly {

        public void fly() {
        }

        public void run() {
        }

        public void swim() {
        }
    }

    public class Penguin implements CanRun, CanSwim {

        public void run() {
        }

        public void swim() {
        }

    }

    public class Airplane implements CanFly, CanRun {

        public void fly() {
        }

        public void run() {
        }
    }
}
