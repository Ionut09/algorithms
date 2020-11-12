package com.lseg.primitives;

import java.util.Arrays;

public class Variables {


    public static void main(String[] args) {

        byte aByte = 3;
        Byte byteWrapper = new Byte(aByte);
        Byte byteWrapper1 = 3; //autoboxing
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);

        short s = 4;
        s = 6 + 5;
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);

        long l = 922337203685477580L; //922337203685477580 cannot be int
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);

        byte sum = 3 + 10;
        sum = (byte) (sum + 1); // default rez operatiei a 2 variabile e int

        double d = 3.5;
        int i = (int) d;
        System.out.println("cast to int = " + i);

        long unLong = Integer.MAX_VALUE + 5L;
        int castFromLongToInt = (int) unLong;
        System.out.println("castFromLongToInt = " + castFromLongToInt);
        System.out.println("Integer.MIN_VALUE + 4 = " + (Integer.MIN_VALUE + 4));
        System.out.println(castFromLongToInt == (Integer.MIN_VALUE + 4));

        long fromInt = castFromLongToInt;
        System.out.println(12345);
        int a = 827189721, b = 827189721;
        int sab = 1 + Integer.MAX_VALUE; //overflow, underflow
        System.out.println("sab = " + sab);

        //formatting
        int formatted = 287_192_8______71;
        System.out.println("formatted = " + formatted);

        float floatVariable = 3.15F;
        double d1 = 3.15;

        System.out.println(5 / 2); //2
        System.out.println(5 / 2.0); //2.5
        System.out.println(5 / 2d); //2.5

        System.out.println(floatVariable);
        System.out.println("floatVariable");

        double g = 2 + 3 * 10 -
                50 / 2 - Math.pow(2, 4)
                + Math.sqrt(25) + Math.sin(Math.PI / 6);

        char c = 'a'; //97
        c = 9712;
        System.out.println(c);
        System.out.println(c + 0);

        char charDefinedByUnicodeCode = '\u052A';
        charDefinedByUnicodeCode = '\u0041';
        System.out.println("charDefinedByUnicodeCode = " + charDefinedByUnicodeCode);

        String string = "\u052A\u052B and other characters: " + (2 + 3);
        System.out.println(string);

        //egalitatea stringurilor
        String s1 = "John";
        String s2 = "Jo" + "hn";
        System.out.println(s1.equals(s2));

        boolean areEqual = s1 == s2;
        System.out.println(areEqual);
        boolean trueField = Boolean.TRUE;
        trueField = true;
        boolean trueParsed = Boolean.parseBoolean("True");

        char[] chars = string.toCharArray();
        System.out.println("chars = " + Arrays.toString(chars));

        //parsing
        int parsedInt = Integer.parseInt("123");
        String strFromInt = String.valueOf(123);//"" + 123;

        long parsedLong = Long.parseLong("2918291829182");
        double parseDouble = Double.parseDouble("291829182.82327");
        System.out.println("parseDouble = " + (parseDouble + 1));

    }
}
