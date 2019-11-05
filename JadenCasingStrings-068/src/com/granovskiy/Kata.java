package com.granovskiy;

public class Kata {
    public static String toJadenCase(String phrase) {
        if (null == phrase || phrase == "") return null;
        String[] words = phrase.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
            builder.append(words[i]);
            builder.append(" ");
        }
        return builder.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
    }
}
