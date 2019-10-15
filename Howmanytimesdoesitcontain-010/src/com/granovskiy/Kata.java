package com.granovskiy;

public class Kata {
    public static int stringCounter(String inputS, char charS) {
        int counter = 0;
        for (int i = 0; i < inputS.length(); i++) {
            if (inputS.charAt(i) == charS) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(stringCounter("Hello World", 'o'));
    }
}
