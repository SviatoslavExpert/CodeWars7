package com.granovskiy;

import java.util.Arrays;

public class Kata {
    public static String removeDuplicateWords(String s) {
        // Your code here, good sir.
        //  str.replace("(with nice players)", "")
        // s.split(" "));
        String[] words = s.split(" ");
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j >= 0; j--) {
                if (words[i].equals(words[j])) {
                    counter++;
                }
                if (words[i].equals(words[j]) && counter > 1) {
                    words[j].replace(words[j], " ");
                }
            }
            counter = 0;
        }
        System.out.println(Arrays.toString(words));
        return Arrays.toString(words);
    }

    public static void main(String[] args) {
        //System.out.println(removeDuplicateWords
                //("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
        removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta");
    }
}
