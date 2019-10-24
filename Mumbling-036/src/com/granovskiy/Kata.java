package com.granovskiy;

public class Kata {
    public static String accum(String s) {
        int counter = 1;
        StringBuilder builder = new StringBuilder();
        for (int k = 0; k < s.length(); k++) {
            for (int i = 0; i <= k; i++) {
                if (i == 0) {
                    builder.append(Character.toUpperCase(s.charAt(k)));
                } else {
                    builder.append(Character.toLowerCase(s.charAt(k)));
                }
            }
            if (k < s.length() - 1) {
                builder.append("-");
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(accum("abcd"));
        System.out.println(accum("ZpglnRxqenU"));
    }
}
// Done!!!
