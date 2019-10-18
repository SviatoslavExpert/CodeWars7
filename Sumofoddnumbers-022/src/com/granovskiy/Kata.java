package com.granovskiy;

public class Kata {
    public static int rowSumOddNumbers(int n) {
        int result = 0;
        int result2 = 0;
        int index = 0;
        int y = 0;
        for (int i = 0; i < 4; i++) {
            result = 1 + 2 + index;
            result2 += result;
            index += 2;
        }
        return result2;
    }

    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(3));
    }
}
