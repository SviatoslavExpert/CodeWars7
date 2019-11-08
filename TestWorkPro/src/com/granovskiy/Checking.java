package com.granovskiy;

public class Checking {
    public static void check(double a, double b, double c) {
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("Формально це - не квадратне рівняння.");
        } else if (a > Double.MAX_VALUE || a < Double.MIN_VALUE
                    || b > Double.MAX_VALUE || b < Double.MIN_VALUE
                    || c > Double.MAX_VALUE || c < Double.MIN_VALUE) {
            System.out.println("Число занадто велике.");
        } else {
            Calculating.calculate(a, b, c);
        }
    }
}
