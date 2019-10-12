package com.granovskiy;

import java.util.Arrays;

public class Kata {
    public static String insertDash(int num) {
        String str = String.valueOf(num);
        int size = str.length();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[size - i - 1] = num % 10;
            num /= 10;
        }
        for (int i = 1; i < size; i++) {
            if (numbers[i] % 2 != 0 && numbers[i - 1] % 2 != 0) {
                numbers[i - 1] = - numbers[i - 1];
            }
        }
        String[] stringNumbers = new String[size];
        for (int i = 0; i < size; i++) {
            stringNumbers[i] = Integer.toString(numbers[i]);
            if (stringNumbers[i].equals("-")) {

            }
        }


        return Arrays.toString(stringNumbers);
    }

    public static void main(String[] args) {
        System.out.println(insertDash(454793));
    }
}
