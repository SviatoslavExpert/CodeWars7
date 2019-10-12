package com.granovskiy;

public class Kata {
    public static int modifiedSum(int[] array, int power) {
        int sum = 0;
        for (int e : array) {
            sum += Math.pow(e, power) - e;
        }
        return sum;
        // return Arrays.stream(array).map(x -> (int)Math.pow(x, power) - x).sum();
    }

    public static void main(String[] args) {
        System.out.println(modifiedSum(new int[] {1,2,3}, 3));
        System.out.println(modifiedSum(new int[] {1,2}, 5));
    }
}
