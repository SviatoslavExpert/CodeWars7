package com.granovskiy;

public class Kata {
    public static String splitInParts(String s, int partLength) {
        StringBuilder builder = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            builder.append(s.charAt(i));
            counter++;
            if (counter == partLength) {
                builder.append(" ");
                counter = 0;
            }
        }
        return builder.toString().trim();
        //  return s.replaceAll("(.{"+partLength+"})(?!$)", "$1 ");
    }

    public static void main(String[] args) {
        System.out.println(splitInParts("supercalifragilisticexpialidocious", 3));
        System.out.println(splitInParts("HelloKata", 3));
    }
}
