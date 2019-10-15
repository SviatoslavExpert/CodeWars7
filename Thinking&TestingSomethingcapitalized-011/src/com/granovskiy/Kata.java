package com.granovskiy;

public class Kata {
    public static String testSomethingCapitalized(String s) {
        char[] chars = s.toCharArray();
        if (chars.length == 1 && chars[0] == ' ' || chars.length == 0) return "";
        if (chars.length == 1) chars[0] = Character.toUpperCase(s.charAt(0));
        for (int i = 1; i < s.length(); i ++) {
            if (chars[i] == ' ') {
                chars[i - 1] = Character.toUpperCase(s.charAt(i - 1));
            }
        }
        //chars[chars.length - 1] = Character.toUpperCase(s.charAt(chars.length - 1));
        chars[chars.length - 1] = (char) Character.toUpperCase(chars.length - 1);
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println(testSomethingCapitalized(""));
        System.out.println(testSomethingCapitalized("a"));
        //System.out.println(testSomethingCapitalized("wyjqv b pdd"));
    }


    //  || s.charAt(i).equals(s.substring(s.length() - 1))
}
