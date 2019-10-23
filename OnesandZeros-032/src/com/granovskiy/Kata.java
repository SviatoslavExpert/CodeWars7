package com.granovskiy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder builder = new StringBuilder();
        for (Integer e : binary) {
            builder.append(e);
        }
        String binaryString = builder.toString();
        return Integer.parseInt(binaryString, 2);
    }

    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>((Arrays.asList(1,1,1,1)))));
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>((Arrays.asList(0,1,1,0)))));
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>((Arrays.asList(1,0,0,1)))));
    }
}
