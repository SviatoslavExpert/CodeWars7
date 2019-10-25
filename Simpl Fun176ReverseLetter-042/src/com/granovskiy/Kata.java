package com.granovskiy;

public class Kata {
    public static String reverseLetter(final String str) {
        StringBuilder builder = new StringBuilder(str);
        String result = builder.reverse().toString();
        return result.replaceAll("[^a-zA-Z]", "");
    }

    public static void main(String[] args) {
        System.out.println(reverseLetter("ultr53o?n"));
    }
}
