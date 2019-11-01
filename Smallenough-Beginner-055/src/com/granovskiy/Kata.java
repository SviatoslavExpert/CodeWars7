package com.granovskiy;

public class Kata {
    public static boolean smallEnough(int[] a, int limit) {
        int counter = 0;
        for (int e : a) {
            if (e <= limit) {
                counter++;
            }
        }
        return counter == a.length;
    }
}
