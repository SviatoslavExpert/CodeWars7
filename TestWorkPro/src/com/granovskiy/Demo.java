package com.granovskiy;

public class Demo {
    public static void main(String[] args) {
        double a = 0.0d;
        double b = 0.0d;
        double c = 0.0d;
        System.out.println("Програма вирішує квадратне рівняння:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введіть a, b и c:");
        Scanning.scan(a, b, c);
    }
}
