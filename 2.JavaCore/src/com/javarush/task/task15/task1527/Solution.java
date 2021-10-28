package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String paramsSubString = url.substring(url.lastIndexOf("?") + 1);
        String[] params = paramsSubString.split("&");
        String objParameter = null;

        StringBuilder result = new StringBuilder();
        for (String param : params) {
            String[] paramAndValue = param.split("=");
            result.append(paramAndValue[0]);
            result.append(" ");

            if (paramAndValue[0].equals("obj")) {
                objParameter = paramAndValue[1];
            }
        }

        System.out.println(result.toString().trim());

        if (objParameter != null) {
            try {
                alert(Double.parseDouble(objParameter));
            } catch (NumberFormatException nfe) {
                alert(objParameter);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
