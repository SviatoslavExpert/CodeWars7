package com.granovskiy;

public class Kata {
    public static String[] capitalize(String s){
        String[] charsOne = s.split("");
        String[] charsTwo = s.split("");
        char temp = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                temp = Character.toUpperCase(s.charAt(i));
                charsOne[i] = charsOne[i].replace(s.charAt(i), temp);
            } else {
                temp = Character.toUpperCase(s.charAt(i));
                charsTwo[i] = charsTwo[i].replace(s.charAt(i), temp);
            }
        }
        String delimiter = "";
        String result1 = String.join(delimiter, charsOne);
        String result2 = String.join(delimiter, charsTwo);
        //String[] result = new String[] {result1, result2};
        return new String[] {result1, result2};
    }

    public static void main(String[] args) {
        capitalize("abcdef");
    }
}

//String result1 = Arrays.toString(charsOne);
//String result2 = Arrays.toString(charsTwo);
//System.out.println(Arrays.toString(charsOne) + " " + Arrays.toString(charsTwo));
        //System.out.println(Arrays.toString(result));
