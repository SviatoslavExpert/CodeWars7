package com.granovskiy;

public class Kata {
    public static Character firstNonRepeated(String source) {
        int counter = 0;
        int size = source.length();
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (source.charAt(i) == source.charAt(j)) counter++;
            }
            if (counter == 1) return source.charAt(i);
            counter = 0;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeated("1122321235121222"));
    }
}
