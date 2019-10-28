package com.granovskiy;

public class Kata {
    public static int reverse(int number) {
        int temp = Math.abs(number);
        String tempAsString = Integer.toString(temp);
        StringBuilder builder = new StringBuilder(tempAsString);
        builder.reverse();
        tempAsString = builder.toString();
        if (number < 0) {
            return -Integer.valueOf(tempAsString);
        }
        return Integer.valueOf(tempAsString);
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(1000));
        System.out.println(reverse(4321234));
        System.out.println(reverse(5));
        System.out.println(reverse(98989898));
    }
}
