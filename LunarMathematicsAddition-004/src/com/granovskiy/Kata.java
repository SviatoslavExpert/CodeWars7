package com.granovskiy;

import java.util.Arrays;

public class Kata {
    public static long add(long number1, long number2)
    {
        int lengthOne = String.valueOf(number1).length();
        int lengthTwo = String.valueOf(number2).length();
        int maxLength = Math.max(lengthOne, lengthTwo);
        long[] result = new long[maxLength];
        for (int i = 0; i < maxLength; i++) {
            if (number1 % 10 >= number2 % 10) {
                result[maxLength - i - 1] = number1 % 10;
                number1 = number1 / 10;
                number2 = number2 / 10;
            } else {
                result[maxLength - i - 1] = number2 % 10;
                number1 = number1 / 10;
                number2 = number2 / 10;
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        add(92956260665L, 518726724062L);
    }
}
