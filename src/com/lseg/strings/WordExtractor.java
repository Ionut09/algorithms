package com.lseg.strings;

public class WordExtractor {

    static String text = "Cookies are important to the proper functioning of a site." +
            " To improve your experience, we use cookies to remember log-in details " +
            "and provide secure log-in, 422 collect statistics to optimize site functionality," +
            " and deliver content tailored to your interests?. Click Agree and Proceed to accept cookies " +
            "and go directly to the site or click on View Cookie Settings to see detailed descriptions of the" +
            " types of cookies and choose whether to accept certain cookies while on the site.";

    public static void main(String[] args) {
        String[] words = text.split("[\\s+0-9.,?!]+");
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            builder.append(word.toLowerCase()).append(",");
        }
        System.out.println(builder.toString());

        String s = "anna";
        System.out.println((isPalindrom(s) ?
                " is Palindrom" : "is not Palindrom ") + "->" + s);
    }

    private static boolean isPalindrom(String input) {
        return new StringBuilder(input).reverse().toString().equals(input);
    }
}
