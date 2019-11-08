package com.granovskiy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanning {
    public static void scan(double a, double b, double c) {
        Scanner scanner = new Scanner(System.in);
        try {
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
            System.out.println("Ви ввели: " + "a = " + a + ", " + " b = " + b + ", " + " c = " + c);
        } catch (InputMismatchException e) {
            System.out.println("Помилка: введені невірні дані.");
        }
        Checking.check(a, b, c);
    }
}
