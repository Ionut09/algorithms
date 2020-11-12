package com.lseg.primitives;

import java.util.Arrays;
import java.util.Random;

public class Homework {

    public static void main(String[] args) {

        Random random = new Random();
        random.nextInt(18);
        int[] primes = getPrimes(15);
        System.out.println(Arrays.toString(primes));
    }

    static int[] getPrimes(int n) {

        int j = 0;
        int[] primes = new int[n];
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primes[j] = i;
                j++;
            }
        }
        return primes;
    }

    static boolean isPrime(int numar) {

        boolean isPrime = true;
        for (int i = 2; i <= numar / 2; i++) {
            if (numar % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    static boolean isPrime2Version(int numar) {

        for (int i = 2; i <= numar / 2; i++) {
            if (numar % i == 0) {
                return false;
            }
        }
        return true;

    }
}
