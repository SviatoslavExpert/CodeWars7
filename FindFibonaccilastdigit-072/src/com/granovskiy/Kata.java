package com.granovskiy;

public class Kata {
    public static int getFibNumb(int n) {
        if (n == 0 || n == 1) return n;
        return (getFibNumb(n - 1) + getFibNumb(n - 2)) % 10;
    }

    public static void main(String[] args) {
        System.out.println(getFibNumb(15));
    }
}
