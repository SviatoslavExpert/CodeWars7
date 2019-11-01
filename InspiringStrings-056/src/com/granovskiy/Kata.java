package com.granovskiy;

public class Kata {
    public static String longestWord(String wordString) {
        String[] array = wordString.split(" ");
        String longestWord = "";
        for (String e : array) {
            if (e.length() >= longestWord.length()) {
                longestWord = e;
            }
        }
        return longestWord;
    }
}
