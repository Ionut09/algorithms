package com.lseg.basic_structures;

public class ForEx {


    public static void main(String[] args) {
        //void --> nu returnez nimic
        //daca returnez ceva, tb specificat in definitia functiei

        cmmdc(24, 36);
    }

    static int findMin(int[] array) {

        int min = array[0]; //sau  Integer.MAX_VALUE;
        for (int i = 0; i <= array.length - 1; i++) {

            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    static void sum(int n) { //n - natural
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of array is: " + sum);
        // return sum;

    }

    static void sumEvenNumbers(int n) { //n - natural
        int sum = 0;

        for (int i = 0; i <= n; i += 2) {
            sum += i;
        }
        System.out.println(sum);
        // return sum;
    }

    /**
     * An = An_1 + An_2
     * complexity: O(n^n)
     */
    static int fibonacciRecursive(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    /**
     fibonacciRecursive(n-1)
     fibonacciRecursive(n-2)
     .
     .
     .
     fibonacciRecursive(0)
     */

    /**
     * An_2   An_1     An
     * 0,     1,       1
     * 1,     1,       2
     * 1,     2,       3
     *
     * complexity: O(nthElement)
     */
    public static int[] fibonacciIterative(int nthElement) {

        int An_2 = 0;
        int An_1 = 1;
        int An;

        int[] fibonacciArray = new int[nthElement];
        fibonacciArray[0] = An_2;
        fibonacciArray[1] = An_1;

        for (int n = 2; n <= nthElement - 1; n++) {
            An = An_1 + An_2;
            An_2 = An_1;
            An_1 = An;
            fibonacciArray[n] = An;
        }

        return fibonacciArray;
    }

    //Integer.parseInt("123");
    static int parseInt(String strNum) {

        int parsedInt = 0;
        char[] chars = strNum.toCharArray(); //['1','2','3']

        for (char digit : chars) {
            parsedInt = parsedInt * 10 + (digit - 48);
            System.out.print(parsedInt + ", ");
        }
        System.out.println("\nparsedInt = " + parsedInt);
        return parsedInt;
    }

    //cmmdc
    static int cmmdc(int first, int second) {

        int div = 1;
        //a e divizor pt b daca b%a==0
        for (int i = 1; i <= first && i <= second; i++) {
            if (first % i == 0 && second % i == 0) {
                div = i;
                System.out.println(div);
            }
        }
        System.out.println("Cel mai mare: " + div);
        return div;
    }

    //n! = 1*2*3*...*n
    static int factorial(int n) {

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("n! = " + factorial);
        return factorial;
    }

    static int primesSum(int limit) {

        int sum = 0;
        for (int i = 1; i <= limit; i++) {

            if (isPrime(i)) {
                sum += i;
            }
//            int contor = 0;
//            for (int j = 2; j <= i / 2; j++) {
//                if (i % j == 0) {
//                    contor++;
//                }
//            }
        }

        return sum;
    }

    static boolean isPrime(int numberToTestIfIsPrime) {

        boolean isPrime = true;
        for (int j = 2; j <= numberToTestIfIsPrime / 2; j++) {
            if (numberToTestIfIsPrime % j == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

}
