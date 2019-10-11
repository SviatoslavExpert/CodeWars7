package com.granovskiy;

public class Kata {
    public static String[] split(final String joint) {
        return (joint.length() != 0) ? joint.split("\\.", -1) : new String[0];
        //return joint.isEmpty() ? new String[0] : joint.split("\\.",-1);
/*        String[]result = joint.split("\\.");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        System.out.println(result.length);
        return result;
*/
    }

    public static void main(String[] args) {
        split("a.b.c");
    }
}
