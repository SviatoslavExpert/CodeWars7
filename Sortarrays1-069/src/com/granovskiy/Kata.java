package com.granovskiy;

import java.util.Arrays;

public class Kata {
    public static int[] sortArray(int[] names) {
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        return names;
    }

    public static void main(String[] args) {
        sortArray(new int[] {2,3,1});
    }
}
