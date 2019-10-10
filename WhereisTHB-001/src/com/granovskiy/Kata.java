package com.granovskiy;

public class Kata {
    public static String testing(String initial) {
        if (initial == null || initial.length() == 0) return "";
        StringBuilder builder = new StringBuilder();
        char tmp = 'A';
        for (int i = 0; i < initial.length(); i++) {
            if (initial.charAt(i) == 't' || initial.charAt(i) == 'T' || initial.charAt(i) == 'h'
                    || initial.charAt(i) == 'H' || initial.charAt(i) == 'b' || initial.charAt(i) == 'B') {
                tmp = initial.charAt(i);
                builder.append(tmp);
            }
        }
        return builder.toString();
    }
}
