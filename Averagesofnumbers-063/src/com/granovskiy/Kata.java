package com.granovskiy;

import java.util.Arrays;

public class Kata {
    public static double[] averages(int[] numbers) {
        if (numbers == null || numbers.length == 0 || numbers.length == 1) return new double[0];
        double[] result = new double[numbers.length - 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = (numbers[i] + numbers[i + 1]) / 2.0;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        averages(new int[] {2,3,5});
    }
}
