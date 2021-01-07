package com.lseg.lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import static java.lang.String.valueOf;

public class Examples {

    public static void main(String... args) {
        OurFunctionalInterface f = new OurFunctionalInterfaceImpl();
        String result = f.oSinguraMetodaAbstracta(true);
//        System.out.println(result);

//        OurFunctionalInterface f = (boolean b) -> {return String.valueOf(b);};

        //String oSinguraMetodaAbstracta(boolean b);
        OurFunctionalInterface fLambda = b -> b + "";
        result = fLambda.oSinguraMetodaAbstracta(true);

        printConvertedBoolean(new OurFunctionalInterfaceImpl());
        printConvertedBoolean(fLambda);
//        printConvertedBoolean(b -> b ? "1" : "0");
        printConvertedBoolean(b -> {
            if (b) {
                return "1";
            } else {
                return "0";
            }
        });

        Function<String, String> mappingToUpper = str -> str.toUpperCase();
        UnaryOperator<String> mappingToUpperUnary = str -> str.toUpperCase();



    }

    private static void printConvertedBoolean(OurFunctionalInterface f) {
        System.out.println(f.oSinguraMetodaAbstracta(false));
    }
}

class OurFunctionalInterfaceImpl implements OurFunctionalInterface {

    @Override
    public String oSinguraMetodaAbstracta(boolean b) {
        return valueOf(b);
    }

    public String oSinguraMetodaAbstracta2(boolean b) {
        return null;
    }
}
