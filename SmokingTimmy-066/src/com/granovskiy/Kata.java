package com.granovskiy;

public class Kata {
    public static int startSmoking(int bars,int boxes){
        double amountOfCigarettes = bars * 180 + boxes * 18;
        double result = amountOfCigarettes;
        while (amountOfCigarettes > 0.01) {
            amountOfCigarettes = 0.2 * amountOfCigarettes;
            result += amountOfCigarettes;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(startSmoking(0, 1));
    }
}
