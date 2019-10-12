package com.granovskiy;

import java.util.Arrays;

public class Kata {
    public static String[] getSocks(String name, String[] socks) {
        for (int i = 0; i < socks.length; i++) {
            for (int j = i + 1; j < socks.length; j++) {
                if (socks[i].equals(socks[j]) && name.equals("Henry")) {
                    return new String[]{socks[i], socks[j]};
                }
                if (!socks[i].equals(socks[j]) && name.equals("Punky")) {
                    return new String[]{socks[i], socks[j]};
                }
            }
        }
        return new String[0];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSocks("Punky", new String[]{"pink", "argyle", "argyle"})));
        System.out.println(Arrays.toString(getSocks("Henry", new String[]{"red", "blue", "blue", "green"})));
        System.out.println(Arrays.toString(getSocks("Henry", new String[]{"green"})));
    }
}
