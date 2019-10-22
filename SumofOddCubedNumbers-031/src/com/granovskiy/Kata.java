package com.granovskiy;

public class Kata {
    public static int cubeOdd(int arr[]) {
        int sum = 0;
        for (int i : arr) {
            int cube = i * i * i;
            if (cube % 2 != 0)
                sum += cube;
        }
        return sum;
    }
}
//   Done!!
