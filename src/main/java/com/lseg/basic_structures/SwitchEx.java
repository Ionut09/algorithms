package com.lseg.basic_structures;

import java.util.Scanner;

public class SwitchEx {

    public static void main(String[] args) {

        printDaysOfMonthWIthSwitch("AUG");
        printDaysOfMonthWIthSwitch("DEC");
        printDaysOfMonthWIthSwitch("FEB");
        calculator();
    }

    /**
     * Print nr de zile pt fiecare luna
     */
    static void printDaysOfMonth(String month) {

        if (month.equals("JAN")) {
            System.out.println(31);
            return;
        }
        if (month.equals("FEB")) {
            System.out.println(28);
            return;
        }
        if (month.equals("MAR")) {
            System.out.println(31);
            return;
        }
        if (month.equals("APR")) {
            System.out.println(30);
            return;
        }
        if (month.equals("MAY")) {
            System.out.println(31);
            return;
        }

        System.out.println("BAD month");
    }

    static void printDaysOfMonthWIthSwitch(String month) {

        switch (month) { //String, int, long, boolean
            case "JAN":
            case "MAR":
            case "MAY":
            case "JUL":
            case "AUG":
            case "OCT":
            case "DEC":
                System.out.println(month + " has " + 31 + " days");
                break;

            case "FEB":
                System.out.println(month + " has " + 28 + " days");
                break;

            case "APR":
            case "JUN":
            case "SEP":
            case "NOV":
                System.out.println(month + " has " + 30 + " days");
                break;

            default:
                System.out.println("BAD month");
        }
    }

    /**
     * if (operation.equals("+")) {
     * System.out.println("a+b=" + (a + b));
     * } else if (operation.equals("-")) {
     * System.out.println("a-b=" + (a - b));
     * } else if (operation.equals("*")) {
     * System.out.println("a*b=" + (a * b));
     * } else if (operation.equals("/")) {
     * System.out.println("a/b=" + (a / (double)b));
     * } else {
     * System.out.println("Bad operation!!!");
     * }
     */
    static void calculator() {

        bucla:
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter first number:");
            int a = scanner.nextInt();

            System.out.println("Enter second number:");
            int b = scanner.nextInt();

            System.out.println("Enter operation or esc to exit");
            String operation = scanner.next();

//            if (operation.equals("esc")) {
//                break;
//            }

            switch (operation) {
                case "+":
                    System.out.println("a+b=" + (a + b));
                    break;

                case "-":
                    System.out.println("a-b=" + (a - b));
                    break;

                case "*":
                    System.out.println("a*b=" + (a * b));
                    break;

                case "/":
                    System.out.println("a/b=" + (a / b));
                    break;
                case "esc":
                    System.out.println(" Bye bye");
                    break bucla;
                default:
                    System.out.println("Bad operation!!!");
            }
        }
    }
}
