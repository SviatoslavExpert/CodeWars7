package com.granovskiy;

public class Kata {
    public static int maxDiff(int[] lst) {
        if (lst == null || lst.length == 1 || lst.length == 0) return 0;
        int max = lst[0];
        int min = lst[0];
        for (int i = 0; i < lst.length; i++) {
            if (lst[i] > max) max = lst[i];
            if (lst[i] < min) min = lst[i];
        }
        return max - min;
    }

    public static void main(String[] args) {
        System.out.println(maxDiff(new int[]{ 1, 2, 3, 4, 5, 5, 4 }));
        System.out.println(maxDiff(new int[]{}));
    }
}
