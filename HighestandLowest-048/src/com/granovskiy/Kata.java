package com.granovskiy;

public class Kata {
    public static String highAndLow(String numbers) {
        if (numbers.length() == 0) return "";
        String[] numbersArray = numbers.split(numbers);
        int size = numbers.length();
        int [] arr = new int [size];
        for(int i = 0; i< size; i++) {
            arr[i] = Integer.parseInt(numbersArray[i]);
        }
        int high = 0;
        int low = 0;
        for (int i = 0; i < arr.length; i++) {
            if (high < arr[i]) {
                high = arr[i];
            }
            if (low > arr[i]) {
                low = arr[i];
            }
        }
        return high + " " + low;
    }
}
