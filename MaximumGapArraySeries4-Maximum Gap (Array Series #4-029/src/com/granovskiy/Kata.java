package com.granovskiy;

import java.util.Arrays;

public class Kata {
    public static int maxGap(int[] numbers) {
        Arrays.sort(numbers);
        int difference = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (Math.abs(numbers[i + 1] - numbers[i]) > difference) {
                difference = Math.abs(numbers[i + 1] - numbers[i]);
            }
        }
        return difference;
    }

    public static void main(String[] args) {
        System.out.println(maxGap(new int[]{13,10,2,9,5}));
    }
}
//  Done!
