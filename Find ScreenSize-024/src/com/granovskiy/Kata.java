package com.granovskiy;

public class Kata {
    public static String findScreenHeight(int width, String ratio) {
        int x = 0;
        int y = 0;
        int z = 0;
        if (ratio.length() == 3) {
            x = Integer.parseInt(String.valueOf(ratio.charAt(0)));
            y = Integer.parseInt(String.valueOf(ratio.charAt(2)));
        }
        if (ratio.length() == 4) {
            x = Integer.parseInt(String.valueOf(ratio.charAt(0)));
            z = Integer.parseInt(String.valueOf(ratio.charAt(1)));
            y = Integer.parseInt(String.valueOf(ratio.charAt(3)));
            x = x * 10 + z;
        }
        int height = width * y / x;
        String stringHeight = String.valueOf(height);
        String stringWidth = String.valueOf(width);
        return stringWidth + "x" + stringHeight;
        //        String[] r = ratio.split(":");
        //        int height = width * Integer.valueOf(r[1]) / Integer.valueOf(r[0]);
        //        return width + "x" + height;
    }

    public static void main(String[] args) {
        System.out.println(findScreenHeight(1024, "4:3"));
        System.out.println(findScreenHeight(1280, "16:9"));
        System.out.println(findScreenHeight(3840,"32:9"));
    }
}
