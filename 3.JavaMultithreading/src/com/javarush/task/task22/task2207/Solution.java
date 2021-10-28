package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        String path;
        // C:\Users\cherr\Documents\1.txt
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))
        ) {
            path = reader.readLine();
        }
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String str;
            while ((str = br.readLine()) != null) {
                for (String word : str.split("\\s+")) {
                    if (!word.isEmpty())
                        list.add(word);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); ) {
                /*if (i >= list.size()) {
                    break;
                }*/
                String rev = new StringBuilder(list.get(i)).reverse().toString();
                if (list.get(j).equals(rev) && j != i) {
                    Pair pair = new Pair();
                    pair.first = list.get(j);
                    pair.second = list.get(i);
                    result.add(pair);
                    list.remove(j);
                    list.remove(i);
                    //j = 0;
                } else
                    j++;
            }
        }
        System.out.println(result.toString());
    }

    public static class Pair {
        String first;
        String second;

        public Pair() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
