package com.granovskiy;

import java.util.Arrays;

public class Kata {
    public static double[] sortItOut(double[] array) {
        int counterOdd = 0;
        int counterEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 1 != 0) array[i] = Math.floor(array[i]);
            if (array[i] % 2 == 0) {
                counterEven++;
            } else {
                counterOdd++;
            }
        }
        System.out.println(counterEven + " " + counterOdd);
        double[] arrayEven = new double[counterEven];
        double[] arrayOdd = new double[counterOdd];

        int j = 0;
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayEven[j] = array[i];
                j++;
            }
            if (array[i] % 2 != 0) {
                arrayOdd[k] = array[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(arrayEven));
        System.out.println(Arrays.toString(arrayOdd));
        System.out.println();
        Arrays.sort(arrayOdd);
        Arrays.sort(arrayEven);
        System.out.println(Arrays.toString(arrayEven));
        System.out.println(Arrays.toString(arrayOdd));

        double temp = 0;
        for (int i = 0; i < arrayEven.length / 2; i++) {
            temp = array[i];
            arrayEven[i] = arrayEven[arrayEven.length - i - 1];
            //arrayEven[arrayEven.length - i - 1] = temp;
        }
        System.out.println();
        System.out.println(Arrays.toString(arrayEven));
        System.out.println(Arrays.toString(arrayOdd));


        return array;
    }

    public static void main(String[] args) {
        sortItOut(new double[]{9, 8, 7, 6, 5, 4, 3, 2, 1});

    }
}
