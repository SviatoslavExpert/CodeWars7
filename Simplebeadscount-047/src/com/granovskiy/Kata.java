package com.granovskiy;

public class Kata {
    public static int countRedBeads(final int nBlue) {
        if (nBlue < 2) return 0;
        return (nBlue - 1) * 2;
        //  return nBlue == 0 ? 0 : (nBlue - 1) * 2;
    }
}
