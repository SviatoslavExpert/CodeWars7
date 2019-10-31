package com.granovskiy;

public class Kata {
    public static final String generateShape(int n) {
        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                builder.append("+");
            }
            if (j < n - 1) {
                builder.append("\n");
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(generateShape(3));
    }
}
