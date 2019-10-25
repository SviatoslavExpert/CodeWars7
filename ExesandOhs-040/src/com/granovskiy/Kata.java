package com.granovskiy;

public class Kata {
    public static boolean getXO(String str) {
        str = str.toLowerCase();
        int counterX = 0;
        int counterO = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                counterX++;
            }
            if (str.charAt(i) == 'o') {
                counterO++;
            }
        }
        return counterX == counterO;
    }
}
//  Done!!!
