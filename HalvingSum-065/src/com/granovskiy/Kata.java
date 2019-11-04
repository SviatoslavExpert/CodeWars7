package com.granovskiy;

public class Kata {
    static int halvingSum(int n) {
        int sum = 0;
        int divider = 1;
        while (n / divider >= 1) {
            sum += n / divider;
            divider = 2 * divider;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(halvingSum(25));
    }
}
