package com.javarush.task.task26.task2603;
import java.util.Comparator;

/* 
Убежденному убеждать других не трудно
*/

public class Solution {

    public static void main(String[] args) {
        /*ArrayList<Woman> women = new ArrayList<Woman>();
        women.add(new Woman(18, 0, 45, 170, "Ann"));
        women.add(new Woman(21, 1, 57, 168, "Iren"));
        women.add(new Woman(5, 0, 20, 110, "Angelina"));

        Comparator<Woman> compareByHeight = new CustomizedComparator<>() {

            public int compare(Woman o1, Woman o2) {
                return o1.height - o2.height;
            }
        };

        Collections.sort(women, compareByHeight);
        for (Woman woman : women) {
            System.out.println(woman);
        }*/
    }

    public static class CustomizedComparator<T> implements Comparator<T> {
        private Comparator<T>[] comparators;

        public CustomizedComparator(Comparator<T>... comparators) {
            this.comparators = comparators;
        }

        @Override
        public int compare(T o1, T o2) {
            int result;
            for (Comparator<T> comparator : comparators) {
                result = comparator.compare(o1, o2);
                if (result != 0) return result;
            }
            return 0;
        }
    }

    /*public static class Woman {

        public int age;
        public int childrenCount;
        public int weight;
        public int height;
        public String name;

        public Woman(int age, int childrenCount, int weight, int height, String name) {

            this.age = age;
            this.childrenCount = childrenCount;
            this.weight = weight;
            this.height = height;
            this.name = name;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + height;
        }
    }*/

}
