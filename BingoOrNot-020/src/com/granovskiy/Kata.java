package com.granovskiy;

public class Kata {
    public static String bingo(int[] numberArray) {
        boolean isB = false;
        boolean isI = false;
        boolean isN = false;
        boolean isG = false;
        boolean isO = false;
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == 2) isB = true;
            if (numberArray[i] == 9) isI = true;
            if (numberArray[i] == 14) isN = true;
            if (numberArray[i] == 7) isG = true;
            if (numberArray[i] == 15) isO = true;
        }
        if (isB && isI && isN && isG && isO) return "WIN";
        return "LOSE";
    }

    public static void main(String[] args) {
        System.out.println(bingo(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(bingo(new int[]{21, 13, 2, 7, 5, 14, 7, 15, 9, 10}));
    }
}
//   Done!
