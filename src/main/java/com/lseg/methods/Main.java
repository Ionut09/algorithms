package com.lseg.methods;

import com.lseg.basic_structures.ForEx;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int sum = 2;
        sum(100);

        ForEx.fibonacciIterative(10);   //may be called with class name or an object --> when is static

        ForEx obj = new ForEx();
        int[] ints = obj.fibonacciIterative(10); //may be called with an object only --> when is not static

        System.out.println("ints = " + Arrays.toString(ints));

        long sumLong = sum;

        sum(2, 3.5);
        sum(2, 3, 4);
        sum(2, 3, 4, 5, 6);
        sum();
        sum(ints);

        sumWithArrayArg(ints);
//        sumWithArrayArg(2,3);

        List intList = List.of(1);
        List intList1 = List.of(1, 2);
        List intList2 = List.of(1, 2, 3);

        System.out.println("intList = " + intList2);

    }

    private static long sum(int n) {

        int sum = 0;
        for (int i = 0; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("sum = " + sum);
        return sum;
    }

    static double sum(int a, double b) {

        return a + b;
    }

    static double sum(double b, int a) {

        return a + b;
    }

    static int sum(int a, int b, int c) {

        return a + b + c;
    }

    static int sum(int a, int b, int c, int d, int e) {

        return a + b + c + d + e;
    }

    //var arg needs to be the last in the parameter list
    static int sum(int... ints) {

        int sum = 0;
        for (int element : ints) {
            sum += element;
        }
        System.out.println("sum = " + sum);
        return sum;
    }

    static int sumWithArrayArg(int[] ints) {

        int sum = 0;
        for (int element : ints) {
            sum += element;
        }
        System.out.println("sum = " + sum);
        return sum;
    }

    static void of(int... varArgs){ //Java 5

    }

}
