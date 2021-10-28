package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    static SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);


    public static void main(String[] args) throws ParseException {
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i = i + 3) {
                        String name = args[i];
                        String sex = args[i + 1];
                        Date birthdayDate = simpleDateFormat1.parse(args[i + 2]);
                        Person person;
                        if (sex.equals("м"))
                            person = Person.createMale(name, birthdayDate);
                        else
                            person = Person.createFemale(name, birthdayDate);
                        allPeople.add(person);
                        System.out.println(allPeople.indexOf(person));
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i = i + 4) {
                        int id = Integer.parseInt(args[i]);
                        String name = args[i + 1];
                        String sex = args[i + 2];
                        Date birthdayDate = simpleDateFormat1.parse(args[i + 3]);
                        Person person = allPeople.get(id);
                        person.setName(name);
                        person.setSex("м".equals(sex) ? Sex.MALE : Sex.FEMALE);
                        person.setBirthDate(birthdayDate);
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        Person currentPerson = allPeople.get(Integer.parseInt(args[i]));
                        currentPerson.setName(null);
                        currentPerson.setSex(null);
                        currentPerson.setBirthDate(null);
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        Person person = allPeople.get(id);
                        System.out.print(person.getName() + " ");
                        System.out.print(person.getSex().equals(Sex.MALE) ? "м " : "ж ");
                        System.out.println(simpleDateFormat2.format(person.getBirthDate()));
                    }
                }
                break;
        }
    }
}
