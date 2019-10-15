package com.granovskiy;

import java.util.Arrays;

public class Kata {
    public static Double[] sortItOut(Double[] array) {
        int counterOdd = 0;
        int counterEven = 0;
        for (int i = 0; i < array.length; i++) {
            //if (array[i] % 1 != 0) array[i] = Math.floor(array[i]);
            if (array[i] % 2.0 == 0) {
                counterEven++;
            } else {
                counterOdd++;
            }
        }
        System.out.println(counterEven + " " + counterOdd);
        Double[] arrayEven = new Double[counterEven];
        Double[] arrayOdd = new Double[counterOdd];
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
        Arrays.sort(arrayOdd);
        Arrays.sort(arrayEven);
        System.out.println(Arrays.toString(arrayEven));
        System.out.println(Arrays.toString(arrayOdd));

        double temp = 0;
        for (int i = 0; i < arrayEven.length / 2; i++) {
            temp = arrayEven[i];
            arrayEven[i] = arrayEven[arrayEven.length - i - 1];
            arrayEven[arrayEven.length - i - 1] = temp;
        }
        System.out.println();
        System.out.println(Arrays.toString(arrayEven));
        System.out.println(Arrays.toString(arrayOdd));

        System.arraycopy(arrayOdd, 0, array, 0, arrayOdd.length);
        System.arraycopy(arrayEven, 0, array, arrayOdd.length, arrayEven.length);
        System.out.println();
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        sortItOut(new Double[]{10.6, 14.6, 14.7, 24.5, 24.7, 27.4, 55.0, 67.0, 70.7, 77.1, 77.3, 80.6, 91.3, 93.7, 95.4});
    }
}
