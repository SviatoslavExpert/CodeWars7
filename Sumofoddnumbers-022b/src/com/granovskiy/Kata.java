package com.granovskiy;

public class Kata {
    public static int rowSumOddNumbers(int n) {
        int x = 1;
        //int y = 1;
        int result = 0;
        int result2 = 0;
        x = x + (n - 1) * 2;
        for (int i = 1; i <= n; i++) {
            result = x + 2 * i;
            result2 += result;
            //y += 1;
        }
        return result2;
    }

    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(4));
    }
}
