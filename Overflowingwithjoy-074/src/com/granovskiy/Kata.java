package com.granovskiy;

public class Kata {
    public static int multiply(int a, int b) {
        if (a * b > 2147483647 || a * b <  -2147483648) {
            throw new ArithmeticException();
        } else {
            return a * b;
        }
/*        int result = 0;
        try {
            result = a * b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
*//*        if (a * b > Integer.MAX_VALUE || a * b < Integer.MIN_VALUE) {
            throw new ArithmeticException();
        }*//*
        return result;*/
    }

    public static void main(String[] args) {
        System.out.println(multiply(139650, 54161));
    }
}
