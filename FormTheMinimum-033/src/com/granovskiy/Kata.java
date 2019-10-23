package com.granovskiy;

public class Kata {
    public static int minValue(int[] values) {
        int min = values[0];
        StringBuilder builder = new StringBuilder();
        for (int k = 1; k <= values.length; k++) {
            for (int i = 0; i < values.length; i++) {
                if (min >= values[i] && values[i] >= 0) {
                    min = values[i];
                    values[i] = -values[i];
                }
                //replaceValuesToNegative(values[i], values);
            }
            builder.append(min);
            min = values[k];
        }
        return Integer.valueOf(builder.toString());
    }

/*    private static void replaceValuesToNegative(int value, int[] values) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == value) {
                values[i] = -values[i];
            }
        }
    }*/

    public static void main(String[] args) {
        //System.out.println(minValue(new int[]{1, 3, 1}));
        System.out.println(minValue(new int[] {4, 7, 5, 7}));
    }
}
