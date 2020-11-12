package com.lseg.strings.regex;

public class IPValidator {

    /**
     * IP address is a string in the form "A.B.C.D", where the value of A, B, C,
     * and D may range from 0 to 255. Leading zeros are allowed.
     * The length of A, B, C, or D can't be greater than 3.

     * 000.12.12.034              true
     * 121.234.12.12              true
     * 23.45.12.56                true
     * 00.12.123.123123.123       false
     * 122.23                     false
     * Hello.IP                   false
     **/
    boolean isValidIp(String ip) {
        return ip.matches(
                "^(25[0-5]|2[0-4][0-9]|[10]?[0-9]?[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|[10]?[0-9]?[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|[10]?[0-9]?[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|[10]?[0-9]?[0-9])$");
    }
}
