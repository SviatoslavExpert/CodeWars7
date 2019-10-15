package com.granovskiy;

public class Kata {
    public static String sortMyString(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) builder.append(s.charAt(i));
        }
        builder.append(" ");
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) builder.append(s.charAt(i));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(sortMyString("METHIONYLTHREONYLTHREONYGLUTAMINYLARGINYL"));
    }
}
