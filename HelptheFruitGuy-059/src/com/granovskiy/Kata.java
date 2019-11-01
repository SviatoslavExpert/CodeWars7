package com.granovskiy;

import java.util.Arrays;

public class Kata {
    public static String[] removeRotten(String[] fruitBasket) {
        if (fruitBasket == null || fruitBasket.length == 0) return new String[0];
        for (int i = 0; i < fruitBasket.length; i++) {
            if (fruitBasket[i].length() >= 6 && fruitBasket[i].substring(0, 6).equals("rotten")) {
                fruitBasket[i] = fruitBasket[i].substring(6, fruitBasket[i].length()).toLowerCase();
            }
        }
        System.out.println(Arrays.toString(fruitBasket));
        return fruitBasket;
    }

    public static void main(String[] args) {
        removeRotten(new String[]{"rottenApple", "rottenBanana", "rottenApple", "rottenPineapple", "Kiwi"});
        removeRotten(new String[]{"Kiwi"});
    }
}
