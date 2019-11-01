package com.granovskiy;

public class Kata {
    public static boolean isLucky(long n) {
        long sum = 0;
        long temp = n;
        do{
            sum += temp % 10;
            temp /= 10;
        } while  (temp > 0);
        return sum == 0 || sum % 9 == 0;
        // return n % 9 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isLucky(18922314132L));
    }
}
