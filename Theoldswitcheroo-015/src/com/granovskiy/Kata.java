package com.granovskiy;

public class Kata {
    public static String vowel2Index(String s) {
        if (s.length() == 0) return "";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                builder.replace(i, i + 1, String.valueOf(i + 1));
            } else {
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(vowel2Index("this is my string"));
        System.out.println(vowel2Index("Codewars is the best site in the world" ));
        //  "C2d4w6rs 10s th15 b18st s23t25 27n th32 w35rld"
    }
}
