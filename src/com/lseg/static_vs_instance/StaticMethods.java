package com.lseg.static_vs_instance;

public class StaticMethods { //just like file name

    public static void main(String[] args) {
        Calculator.printSum(10, 20);
        printSum(10, 19);
    }

    public static void printSum(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}

class Calculator {

    public static void printSum(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}
