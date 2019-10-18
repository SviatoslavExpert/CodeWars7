package com.granovskiy;

public class Kata {
    public static String spacify(String str){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            builder.append(str.charAt(i));
            builder.append(" ");
        }
        String result = builder.toString();
        return result.substring(0, result.length() - 1);
        //  return str.replaceAll("", " ").trim();
    }

    public static void main(String[] args) {
        System.out.println(spacify("hello world"));
    }
}
