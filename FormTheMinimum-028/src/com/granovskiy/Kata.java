package com.granovskiy;

import java.util.Arrays;

public class Kata {
    public static int minValue(int[] values){
        int min = values[0];
        int[] valuesNew = new int[values.length];
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < valuesNew.length; j++) {
                if (min >= values[j] && values[j] != Integer.MAX_VALUE) {
                    min = values[j];
                    values[j] = Integer.MAX_VALUE;
                }
            }
            valuesNew[i] = min;
        }

        System.out.println(Arrays.toString(valuesNew));
        builder.append(min);
        //values[i] = Integer.MAX_VALUE;

        String result = builder.toString();
        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        //System.out.println(minValue(new int[] {9, 5 ,1}));
        minValue(new int[] {9, 5 ,1});
    }
}
