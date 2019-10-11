package com.granovskiy;

import java.util.Arrays;

public class Kata {
    public static long add(long number1, long number2) {
        int lengthOne = String.valueOf(number1).length();
        int lengthTwo = String.valueOf(number2).length();
        int maxLength = Math.max(lengthOne, lengthTwo);
        int y = 1;
        long result = 0L;
        for (int i = 0; i < maxLength; i++) {
            if (number1 % 10 >= number2 % 10) {
                result += (long) number1 % 10 * y;
            } else {
                result += (long) number2 % 10 * y;
            }
            y *= 10;
            number1 = number1 / 10;
            number2 = number2 / 10;
        }
        System.out.println(result);
        return result;
    }
/*

    public static long add(long n1, long n2) {
        long v = 0, c=1;
        while (n1!=0 || n2!=0) {
            v += Math.max(n1%10, n2%10) * c;
            n1 /= 10; n2 /= 10; c *= 10;
        }
        return v;
    }
*/

    public static void main(String[] args) {
        add(2956260665L, 8726724062L);
    }
}
