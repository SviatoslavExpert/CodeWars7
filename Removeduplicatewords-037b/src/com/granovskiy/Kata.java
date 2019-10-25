package com.granovskiy;

import java.util.Arrays;

public class Kata {
    public static String removeDuplicateWords(String s) {
        int counter = 0;
        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));
        for (int i = 0; i < words.length; i++) {
            if (words[0] == words[i]) {
                counter++;
            }
        }
        System.out.println(counter);
        return Arrays.toString(words);
    }

    public static void main(String[] args) {
        //System.out.println(removeDuplicateWords
        //("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
        removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta alpha");
    }
}
