package com.granovskiy;

public class Kata {
    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        int sum = age1 * age1 + age2 * age2 + age3 * age3 + age4 * age4
                + age5 * age5 + age6 * age6 + age7 * age7 + age8 * age8;
        return ((int) Math.sqrt(sum)) / 2;
    }

    public static void main(String[] args) {
        System.out.println(predictAge(65, 60, 75, 55, 60, 63, 64, 45));
    }
}
