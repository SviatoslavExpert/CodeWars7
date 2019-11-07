package com.granovskiy;

public class Kata {
    public static int findSmallest( final int[] numbers, final String toReturn ) {
        //int result = 0;
        int minimum = numbers[0];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (minimum > numbers[i]) {
                minimum = numbers[i];
                index = i;
            }
        }
/*        if (toReturn == "value") {
            result = minimum;
        }
        if (toReturn == "index") {
            result = index;
        }*/
        return toReturn == "value" ? minimum : index;
    }

    public static int findSmallest() {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findSmallest(new int[]{1, 2, 3}, "index"));
        System.out.println(findSmallest(  ));
    }
}
