package com.granovskiy;

public class Kata {
    public static int adjacentElementsProduct(int[] array) {
        int max1 = 0;
        int max2 = array[0];
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            max1 = array[i] * array[i - 1];
            if (max1 < temp && max1 != 0) {
                max1 = temp;
            }
            temp = max1;
            if (max2 < max1) {
                max2 = max1;
            }
        }
        return max2;
    }

    public static void main(String[] args) {
        //System.out.println(adjacentElementsProduct(new int[] {5, 8}));
        //System.out.println(adjacentElementsProduct(new int[] {4, 12, 3, 1, 5}));
        System.out.println(adjacentElementsProduct(new int[] {1, 0, 1, 0, 1000}));
        //System.out.println(adjacentElementsProduct(new int[] {1, 2, 3, 0}));
        //System.out.println(adjacentElementsProduct(new int[] {-23, 4, -5, 99, -27, 329, -2, 7, -921}));
    }
}
