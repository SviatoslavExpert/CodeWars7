package com.granovskiy;

public class Kata {
    public static int minValue(int[] values){
        int min = values[0];
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            if (min >= values[i] && values[i] != Integer.MAX_VALUE) {
                min = values[i];
                builder.append(min);
                values[i] = Integer.MAX_VALUE;
            }
        }
        String result = builder.toString();
        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        System.out.println(minValue(new int[] {9, 5 ,1}));
    }
}
