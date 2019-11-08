package com.granovskiy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        double a = 0.0d;
        double b = 0.0d;
        double c = 0.0d;
        System.out.println("Програма вирішує квадратне рівняння:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введіть a, b и c:");
        scan(a, b, c);
    }

    private static void scan(double a, double b, double c) {
        Scanner scanner = new Scanner(System.in);
        try {
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
            System.out.println("Ви ввели: " + "a = " + a + ", " + " b = " + b + ", " + " c = " + c);
        } catch (InputMismatchException e) {
            System.out.println("Помилка: введені невірні дані.");
        }
        check(a, b, c);
    }

    private static void check(double a, double b, double c) {
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("Формально це - не квадратне рівняння.");
        } else {
            calculate(a, b, c);
        }
    }

    private static void calculate(double a, double b, double c) {
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
