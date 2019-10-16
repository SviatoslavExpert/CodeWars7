package com.granovskiy;

public class Kata {
    public static int houseNumbersSum(final int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result += arr[i];
            } else {
                return result;
            }
        }
        return result;
    }
}
