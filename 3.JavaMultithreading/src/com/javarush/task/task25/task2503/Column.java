package com.javarush.task.task25.task2503;

import java.util.*;

public enum Column implements Columnable {
    Customer("Customer"),
    BankName("Bank Name"),
    AccountNumber("Account Number"),
    Amount("Available Amount");

    private String columnName;

    private static int[] realOrder;

    private Column(String columnName) {
        this.columnName = columnName;
    }

    /**
     * Задает новый порядок отображения колонок, который хранится в массиве realOrder.
     * realOrder[индекс в энуме] = порядок отображения; -1, если колонка не отображается.
     *
     * @param newOrder новая последовательность колонок, в которой они будут отображаться в таблице
     * @throws IllegalArgumentException при дубликате колонки
     */
    public static void configureColumns(Column... newOrder) {
        realOrder = new int[values().length];
        for (Column column : values()) {
            realOrder[column.ordinal()] = -1;
            boolean isFound = false;

            for (int i = 0; i < newOrder.length; i++) {
                if (column == newOrder[i]) {
                    if (isFound) {
                        throw new IllegalArgumentException("Column '" + column.columnName + "' is already configured.");
                    }
                    realOrder[column.ordinal()] = i;
                    isFound = true;
                }
            }
        }
    }

    /**
     * Вычисляет и возвращает список отображаемых колонок в сконфигурированом порядке (см. метод configureColumns)
     * Используется поле realOrder.
     *
     * @return список колонок
     */
    public static List<Column> getVisibleColumns() {
        List<Column> result = new ArrayList<>();
        TreeMap<Integer, Column> treeMap = new TreeMap<>();
        for (int i = 0; i < realOrder.length; i++) {
            treeMap.put(realOrder[i], values()[i]);
        }
        for (Map.Entry<Integer, Column> entry : treeMap.entrySet()) {
            if (entry.getKey() >= 0)
                result.add(entry.getValue());
        }
        return result;
    }

    //Метод Column.getColumnName должен возвращать полное имя колонки.
    @Override
    public String getColumnName() {
        return columnName;
    }

    //Метод Column.isShown должен возвращать true, если колонка видимая, иначе false.
    @Override
    public boolean isShown() {
        return realOrder[ordinal()] != -1;
    }

    //Метод Column.hide должен скрывать колонку и сдвигать индексы остальных отображаемых колонок.
    @Override
    public void hide() {
        realOrder[this.ordinal()] = -1;
    }
}
