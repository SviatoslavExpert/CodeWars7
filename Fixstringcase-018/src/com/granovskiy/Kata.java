package com.granovskiy;

public class Kata {
    public static String solve(final String str) {
        int counterLowerCase = 0;
        int counterUpperCase = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                counterUpperCase++;
            } else {
                counterLowerCase++;
            }
        }
        return counterLowerCase >= counterUpperCase ? str.toLowerCase() : str.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(solve("code"));
        System.out.println(solve("CODe"));
        System.out.println(solve("COde"));
        System.out.println(solve("Code"));
    }
}

// Done!
