package com.lseg.basic_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhileEx {

    public static void main(String[] args) {

        int n1 = 24;
        int n2 = 36;
        cmmdc(n1, n2);
        isPalindrom(21121);
        isPalindrom(32823);

    }

    static void printNumberDigits(int n) {

        if (n == 0) {
            System.out.println("The number is 0");
            return;
        }

        if (n < 0) {
            n = n * (-1);
        }
        int[] array = new int[10];
        List<Integer> digits = new ArrayList<>();
        int count = 0;

        while (n != 0) {
            int digit = n % 10; //% restul impartirii nr la 10
            n = n / 10;
            digits.add(digit);
            array[9 - count] = digit;
            count++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(digits);
    }

    /**
     * conversie la while
     * int min = array[0]; //sau  Integer.MAX_VALUE;
     * for (int i = 0; i <= array.length - 1; i++) {
     *
     * if (array[i] < min) {
     * min = array[i];
     * }
     * }
     */
    static int findMin(int[] array) {

        int min = array[0]; //sau  Integer.MAX_VALUE;
        int length = array.length - 1;
        while (length != 0) {

            if (array[length] < min) {
                min = array[length];
            }

            length--;
        }
        return min;
    }

    /**
     * Euclid
     * 1 --> n2 > n1 then n2 = 36 - 24 =12
     * n1 = 24;
     * n2 = 12;
     * 2 -->   n1 > n2 then n1 = 24 -12 = 12
     * n1==n2==12
     */
    static int cmmdc(int n1, int n2) {

        System.out.print("Cmmdc dintre " + n1 + " si " + n2 + " este: ");
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println(n1);
        return n1;
    }

    /**
     * Palindrom is a number equal with its reverse
     * EX: 32823, 7887
     */
    static boolean isPalindrom(int n) {

        int reverse = 0;
        int temp = n;

        while (n != 0) {
            int digit = n % 10;
//          n=n/10;
            n /= 10;
            reverse = reverse * 10 + digit;
        }
        boolean isPalindrom = reverse == temp;
        System.out.println(temp + " is palindrom: " + isPalindrom);
        return isPalindrom;
    }


    /**
     * static void sum(int n) { //n - natural
     * int sum = 0;
     *
     * for (int i = 1; i <= n; i++) {
     * sum += i;
     * }
     * System.out.println("Sum of array is: " + sum);
     * // return sum;
     *
     * }
     * equivalent with while
     */
    static void sum(int n) {

        int sum = 0;

        int i = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
//        i-->n
    }

}
