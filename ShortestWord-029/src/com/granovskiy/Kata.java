package com.granovskiy;

public class Kata {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        int min = words[0].length();
        for (int i = 0; i < words.length; i++) {
            if (min >= words[i].length()) {
                min = words[i].length();
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
    }
}
//   Done!
