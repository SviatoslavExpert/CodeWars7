package com.granovskiy;

public class Kata {
    public static double area(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException();
        }
        return (Math.round(Math.PI * (radius * radius) * 100.00)) / 100.00;
    }

    public static void main(String[] args) {
        System.out.println(area(3.55));
    }
}
