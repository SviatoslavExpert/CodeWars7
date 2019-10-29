package com.granovskiy;

public class Kata {
    public static boolean solution(String str, String ending) {
        int endingLength = ending.length();
        int stringLength = str.length();
        if (stringLength >= endingLength) {
            String strEnding = str.substring(stringLength - endingLength, stringLength);
            return strEnding.equals(ending);
        }
        return false;
        //  return str.endsWith(ending);
    }

    public static void main(String[] args) {
        System.out.println(solution("abc", "c"));
        System.out.println(solution("abc", "bc"));
        System.out.println(solution("abc", "abc"));
        System.out.println(solution("fails", "ails"));
        System.out.println(solution("fails", "fail"));
        System.out.println(solution("-123", "23"));
        System.out.println(solution("samurai", "ai"));
    }
}
