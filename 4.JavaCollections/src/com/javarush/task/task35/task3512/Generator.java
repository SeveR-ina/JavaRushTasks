package com.javarush.task.task35.task3512;

public class Generator<T> {
    Class<T> classField;

    public Generator(Class<T> classField) {
        this.classField = classField;
    }

    T newInstance() {
        try {
            return classField.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
