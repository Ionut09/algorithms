package com.lseg.strings;

public class CNPValidator {

    public static boolean isValid(String cnp) {
        if (cnp.length() != 13) {
            return false;
        }

        if (cnp.startsWith("1") ||
                cnp.startsWith("6") ||
                cnp.startsWith("2") ||
                cnp.matches("[0-9]*")) {
            return true;
//            try {
//                Long.parseLong(cnp);
//                return true;
//            } catch (Exception t) {
//                return false;
//            }
            //NU asa
        }
        return false;
    }
}
