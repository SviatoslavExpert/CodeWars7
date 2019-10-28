package com.granovskiy;

public class Java {
    static public int nextHappyYear(int year) {
        int digit1;
        int digit2;
        int digit3;
        int digit4;
        while (year <= 9012) {
            year++;
            digit1 = year / 1000;
            digit2 = year % 1000 / 100;
            digit3 = year % 100 / 10;
            digit4 = year % 10;
            if (digit1 != digit2 && digit1 != digit3 && digit1 != digit4
                    && digit2 != digit3 && digit2 != digit4 && digit3 != digit4) {
                return year;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(nextHappyYear(1001));
        System.out.println(nextHappyYear(1001));
    }
}
