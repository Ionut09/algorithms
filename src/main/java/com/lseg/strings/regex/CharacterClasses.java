package com.lseg.strings.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;
import static java.util.regex.Pattern.matches;

/**
 *     ^ si $ reprezinta inceputul si respectiv sfarsitul unui string
 *     () reprezinta un grup ce poate fi referentiat apoi din regex sau folosind Matcher API
 */
public class CharacterClasses {

    /**
     * [abc]​     a, b, or c (simple class)​
     * [^abc]​     Any character except a, b, or c (negation)​
     * [a-zA-Z]​     a through z or A through Z, inclusive (range)​
     * [a-d[m-p]]​     a through d, or m through p: [a-dm-p] (union)​
     * [a-z&&[def]]​     d, e, or f (intersection)​
     * [a-z&&[^bc]]​     a through z, except for b and c: [ad-z] (subtraction)​
     * [a-z&&[^m-p]]​     a through z, and not m through p: [a-lq-z](subtraction)​
     */
    public static void main(String[] args) {
        String regex = "[a-k]";
        String input = "j";

        //mode 1
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(input);
        boolean matches = m.matches();
        System.out.println(matches); //true

//        mode 2
        matches = Pattern.compile(regex).matcher(input).matches(); //true
        System.out.println(matches); //true

        //mode 3
        matches = matches(regex, input); //
        System.out.println(matches); //true
        System.out.println(pattern.pattern());


        //character classes
        matches = matches("[345]", "4"); //true
        matches = matches("[3-5]", "4"); //true
        matches = matches("[345]", "43"); //false pt ca o clasa [] ia un singur caracter
        matches = matches("[^3-5]", "4"); //false
        matches = matches("[a-dm-rA-K]", "e"); //false
        Matcher matcher = Pattern.compile("[a-dm-rA-K]", CASE_INSENSITIVE).matcher("e");
        matches = matcher.matches(); //true

        matches = matches("^[A-Z]\\w+", "Andrei"); //true
        matches = matches("^[A-Z]\\w+", " Andrei"); //false
        matches = matches("[A-Z]\\w+", " Andrei"); //false
        System.out.println(matches);

        System.out.println(digitExtractor("jdnw32 j32j 9832 3i 2223  && 2981u921"));
    }

    private static String digitExtractor(String input) {
//      Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
        //<22div> Hello </22div>
        StringBuilder sb = new StringBuilder();
//      Pattern pattern = Pattern.compile("([0-9]+)");
        Pattern pattern = Pattern.compile("(\\d+)");
        Matcher m = pattern.matcher(input);
        while (m.find()) {
            sb.append(m.group()).append(",");
        }
        return sb.substring(0, sb.length() - 1);
    }
}
