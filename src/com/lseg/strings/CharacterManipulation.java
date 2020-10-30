package com.lseg.strings;

public class CharacterManipulation {

    public static void main(String[] args) {
        //Strings are immutable
        String immutable = "We are in a quest for knowledge";
        System.out.println(immutable);
        String upperImmutable = immutable.toUpperCase();
        System.out.println("immutable = " + immutable);
        System.out.println("upperImmutable = " + upperImmutable);

        String s = "";
        for (int i = 0; i < 1000; i++) {
            s += i;
        }
        //1000 stringuri in memorie

        String s1 = "My birthday is on %d October";

        String replaced = s1.replace("%d", "12");
        System.out.println(replaced);


        replaced = String.format(s1, 12);
        System.out.println(replaced);


        Filepath filepath = new Filepath("/home/ionut/workspace/LSEG/algorithms/files/textFile.txt", "/", ".");
        System.out.println("Filename: " + filepath.fileName());
        System.out.println("Extension: " + filepath.extension());

        String cnp = "    1235678933327  ";
        boolean valid = CNPValidator.isValid(cnp.trim());
        System.out.println("valid = " + valid);
        //custom exceptions
    }

}
