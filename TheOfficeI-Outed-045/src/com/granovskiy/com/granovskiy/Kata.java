package com.granovskiy.com.granovskiy;

public class Kata {
    public static String outed(Person[] meet, String boss) {
        int sum = 0;
        int bossRating = 0;
        for (int i = 0; i < meet.length; i++) {
            sum += meet[i].happiness;
            if (meet[i].name == boss) {
                bossRating = meet[i].happiness;
            }
        }
        sum += bossRating;
        if (sum / meet.length <= 5) {
            return "Get Out Now!";
        }
        return "Nice Work Champ!";
    }
}
