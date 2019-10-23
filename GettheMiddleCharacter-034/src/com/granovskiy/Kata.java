package com.granovskiy;

public class Kata {
    public static String getMiddle(String word) {
        int halfLength = word.length() / 2;
        return word.length() % 2 == 0 ? word.substring(halfLength - 1, halfLength + 1)
                : word.substring(halfLength, halfLength + 1);
    }

    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("middle"));
        System.out.println(getMiddle("top"));
        System.out.println(getMiddle("house"));
        System.out.println(getMiddle("ggghlll"));
    }
}
