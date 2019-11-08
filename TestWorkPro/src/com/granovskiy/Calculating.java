package com.granovskiy;

public class Calculating {
    public static void calculate(double a, double b, double c) {
        double d;
        System.out.println("Підрахунок дескримінанти за формулою: " + "d = (b * b) - (4 * a * c)");
        d = b * b - 4 * a * c;
        System.out.println("Дескримінанта: " + d);
        if (d < 0) {
            System.out.println("Коренів немає.");
        } else if (d == 0) {
            System.out.println("Рівняння має один корінь: ");
            System.out.println((-b) / (2 * a));
        } else {
            System.out.println("Рівняння має два корені: ");
            System.out.println("Корінь перший: " + (-b - Math.sqrt(d)) / (2 * a));
            System.out.println("Корінь другий: " + (-b + Math.sqrt(d)) / (2 * a));
        }
    }
}
