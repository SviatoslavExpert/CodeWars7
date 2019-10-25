package com.granovskiy;

public class Kata {
    public static String swap(String st){
        char characterToChange = ' ';
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'a' || st.charAt(i) == 'e'
                    || st.charAt(i) == 'i' || st.charAt(i) == 'o'
                    || st.charAt(i) == 'u') {
                characterToChange = Character.toUpperCase(st.charAt(i));
                st = st.replace(st.charAt(i),characterToChange);
            }
        }
        return st;
        //  return st.replace("a","A").replace("e","E").replace("i","I").replace("o","O").replace("u","U");
    }

    public static void main(String[] args) {
        System.out.println(swap("Hello World!"));
    }
}
