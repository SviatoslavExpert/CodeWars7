package com.granovskiy;

public class Kata {
    public static String bumps(final String road) {
        int counter = 0;
        for (int i = 0; i < road.length(); i++) {
            if (road.charAt(i) == 'n') {
                counter++;
            }
        }
        if (counter > 15) {
            return "Car Dead";
        }
        return "Woohoo!";
    }
}
