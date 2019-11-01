package com.granovskiy;

public class Kata {
    public static int testAB(int a, int b) {
        if (a % 2 == 0 || b % 2 == 0) {
            return a + b;
        } else {
            return a * b;
        }
    }

    public static void main(String[] args) {
        System.out.println(testAB(2, 107));
    }
}
