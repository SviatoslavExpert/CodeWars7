package com.granovskiy;

import java.math.BigInteger;

public class Kata {
    public static int countArgs(Object... args) {
        int counter = 0;
        for (int i = 0; i < args.length; i++) {
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(countArgs('a', 865, "asfhgajsf", new BigInteger("123456"), 5));
    }
}
