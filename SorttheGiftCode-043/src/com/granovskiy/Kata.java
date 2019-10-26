package com.granovskiy;

import java.util.Arrays;

public class Kata {
    public String sortGiftCode(String code){
        char[] chars = code.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}
