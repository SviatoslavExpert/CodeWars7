package com.granovskiy;

import java.util.Arrays;

public class Kata {
    public static String[] capMe(String[] strings) {
        String temp = "";
        for (int i = 0; i < strings.length; i++) {
            temp = strings[i].substring(0, 1).toUpperCase();
            strings[i] = temp + strings[i].substring(1).toLowerCase();
        }
        System.out.println(Arrays.toString(strings));
        return strings;
    }

    public static void main(String[] args) {
        capMe(new String[] {"jo", "nelson", "jurie"});
        capMe(new String[] {"Jo", "Nelson", "Jurie" });
    }
}
