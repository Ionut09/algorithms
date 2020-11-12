package com.lseg.basic_structures;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        enterPinWhithWhile();
    }

    private static void enterPinWithDoWhile() {

        String pin = "1234";
        String input;
        int contor = 0;
        do {
            //citim inputul
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter pin:");
            input = scanner.next();
            contor++;
        } while (!pin.equals(input) && contor < 3);

        if (contor == 3) {
            System.out.println("Wrong pin, card blocked!");
        } else {
            System.out.println("Pin is ok!!!");
        }
    }

    static void enterPinWhithWhile() {

        String pin = "1234";
        String input = pin + "uddi";
        int contor = 0;


        while (!pin.equals(input) && contor < 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter pin:");
            input = scanner.next();
            contor++;
        }

        if (contor == 3) {
            System.out.println("Wrong pin, card blocked!");
        } else {
            System.out.println("Pin is ok!!!");
        }

    }
}
