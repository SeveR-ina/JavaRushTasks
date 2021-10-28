package com.javarush.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* 
Глубокое клонирование карты
*/

public class Solution implements Cloneable {
    protected Map<String, User> users = new LinkedHashMap<>();

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone;
        try {
            clone = (Solution) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public boolean equals(Object clonedObj) {
            if (this == clonedObj) return true;
            if (clonedObj == null) return false;
            if (getClass() != clonedObj.getClass()) return false;
            User user = (User) clonedObj;
            if (age != user.age) return false;
            return (name != null) ?
                    name.equals(((User) clonedObj).name) : user.name == null;
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Solution clonedObj = (Solution) super.clone();
        Map<String, User> anotherUsers = new LinkedHashMap<>();
        for (String name : clonedObj.users.keySet()) {
            User user = clonedObj.users.get(name);
            anotherUsers.put(name, (User) user.clone());
        }
        clonedObj.users = anotherUsers;
        return clonedObj;
    }
}
