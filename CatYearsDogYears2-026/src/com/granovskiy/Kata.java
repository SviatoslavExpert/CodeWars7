package com.granovskiy;

import java.util.Arrays;

public class Kata {
    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        int[] result = new int[2];
        if (catYears < 15) result[0] = 0;
        if (catYears < 24 && catYears >= 15) result[0] = 1;
        if (catYears >= 24) result[0] = (int) ((catYears - 24) / 4.0 + 2.0);
        if (dogYears < 15) result[1] = 0;
        if (dogYears < 24 && dogYears >= 15) result[1] = 1;
        if (dogYears >= 24) result[1] = (int) ((dogYears - 24) / 5.0 + 2.0);
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        ownedCatAndDog(15, 15);
        ownedCatAndDog(24, 24);
        ownedCatAndDog(56, 64);
        ownedCatAndDog(34, 51);
        ownedCatAndDog(0, 0);
        ownedCatAndDog(12, 22);
    }
}
