package com.granovskiy;

public class Kata {
    public static boolean inviteMoreWomen(int[] l) {
        int counterMale = 0;
        int counterFemale = 0;
        for (int i = 0; i < l.length; i++) {
            if (l[i] == 1) {
                counterMale++;
            }
            if (l[i] == -1) {
                counterFemale++;
            }
        }
        return counterMale > counterFemale;
    }

    public static void main(String[] args) {
        System.out.println(inviteMoreWomen(new int[] {1, -1, 1}));
    }
}
