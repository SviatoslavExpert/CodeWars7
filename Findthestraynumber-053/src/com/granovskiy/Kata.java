package com.granovskiy;

public class Kata {
    static int stray(int[] numbers) {
        int firstNumber = numbers[0];
        for (int i = 2; i < numbers.length; i++) {
            if (firstNumber != numbers[i] && firstNumber != numbers[i - 1]) {
                return firstNumber;
            }
            if (firstNumber != numbers[i]) {
                return numbers[i];
            }
        }
        return 0;
    }
}
