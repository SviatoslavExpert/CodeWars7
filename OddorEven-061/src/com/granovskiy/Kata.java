package com.granovskiy;

public class Kata {
    public static String oddOrEven (int[] array) {
        if (array.length == 0) return "even";
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        if (sum % 2 == 0) return "even";
        return "odd";
    }
}
