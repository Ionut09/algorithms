package com.lseg.strings;

public class NumbersToStrings {

    public static void main(String[] args) {
        int i = 22;
        String s = i + "";
        s = String.valueOf(i);

        s = Integer.toString(i);
        s = Double.toString(2.3);

        Long id = 234567890827L;
        s = id.toString();
    }
}
