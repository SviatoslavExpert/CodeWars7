package com.granovskiy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {
    public static List<String> number(List<String> lines) {
        List<String> linesUpdated = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < lines.size(); i++) {
            builder.append(i + 1 + ": ");
            builder.append(lines.get(i));
            lines.set(i, builder.toString());
        }
        return lines;
    }

    public static void main(String[] args) {
        System.out.println(number(Arrays.asList("a", "b", "c")));
    }
}
