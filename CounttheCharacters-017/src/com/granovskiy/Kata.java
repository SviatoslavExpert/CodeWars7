package com.granovskiy;

public class Kata {
    public static int charCount(String str, char c) {
        int counter = 0;
        if (Character.isUpperCase(c)) str = str.toUpperCase();
        if (Character.isLowerCase(c)) str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(charCount("fizzbuzz", 'z'));
        System.out.println(charCount("FIZZBUZZ", 'z'));
    }
}
//  Done!
