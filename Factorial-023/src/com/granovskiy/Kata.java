package com.granovskiy;

public class Kata {
    public static int factorial(int n) {
        if (n < 0 || n > 12) throw new IllegalArgumentException();
        if (n == 0 || n == 1) return 1;
        n = n * factorial(n - 1);
        return n;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
//  Done!
