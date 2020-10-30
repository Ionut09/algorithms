package com.lseg.strings;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

import static java.util.Locale.UK;

public class StringsToNumbers {

    public static void main(String[] args) {
        String number = "12348";
//        NumberFormat formatter = new DecimalFormat("0.00");
//        formatter.setCurrency(Currency.getInstance(UK));
//        String format = formatter.format(12344);
//        System.out.println("format = " + format);

        int i = Integer.parseInt(number);
        double d = Double.valueOf("0.55");
        System.out.println(i);
        System.out.println(d);

        Integer a = 2; //boxing
        int i1 = a; //unboxing
        //conversie automata din Java 5, autoboxing
    }
}
