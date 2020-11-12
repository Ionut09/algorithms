package com.lseg.basic_structures;

import java.util.Scanner;

public class IfELse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = scanner.nextInt();

        System.out.println("Enter second number:");
        int b = scanner.nextInt();

        System.out.println("Enter operation");
        String operation = scanner.next();

        if (operation.equals("+")) {
            System.out.println("a+b=" + (a + b));
        } else if (operation.equals("-")) {
            System.out.println("a-b=" + (a - b));
        } else if (operation.equals("*")) {
            System.out.println("a*b=" + (a * b));
        } else if (operation.equals("/")) {
            System.out.println("a/b=" + (a / (double)b));
        } else {
            System.out.println("Bad operation!!!");
        }
    }
}
