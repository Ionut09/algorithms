package com.lseg.strings;

public class BalancedBrackets {

    static String[] strings = {
            "()",
            "[()]", //-> "[]" -> "" -> is balanced
            "{[()]}",
            "([{{[(())]}}])",
            "abc[](){}", //abc(){} -> abc{} -> abc -> is not balanced
            "{{[]()}}}}",
            "{[(])}"
    };

    public static void main(String[] args) {
        String s = null;
        String s1 = "";

        for (String string : strings) {
            System.out.println((isBalanced(string) ?
                    " is balanced" : "is not balanced ") + "->" + string);
        }

    }

    private static boolean isBalanced(String input) {
        String emptyString = "";

        while (input.contains("()") ||
                input.contains("[]") ||
                input.contains("{}")) {

            input = input.replaceAll("\\(\\)", emptyString)
                         .replaceAll("\\[\\]", emptyString)
                         .replaceAll("\\{\\}", emptyString);
            //input e la fel, pt ca e immutable
        }

        return input.length() == 0; //input.equals(emptyString); //

    }

}
