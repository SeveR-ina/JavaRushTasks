package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());
        System.out.println(middleNumber(x, y, z));
        /*int s = 0;
        if ((x == y) || (x == z)){
            s = s + 1;
            if ((x == y) && (x == z)) {
                s = s + 1;
            }
        }
        if (s == 1) {
            System.out.println(x);
        } else if (s == 2) {
            System.out.println(z);
        } else {
            s = (x + y + z) / 3;
            System.out.println(s);
        }
    }*/
    }

    public static int middleNumber(int a, int b, int c) {
        int tmp;
        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        if (b > c) {
            b = c;
        }
        if (a > b) {
            b = a;
        }
        return b;
    }
}
