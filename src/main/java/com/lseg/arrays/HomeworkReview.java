package com.lseg.arrays;

import java.util.Arrays;

public class HomeworkReview {

    public static void main(String[] args) {

        int[] array = new int[]{20, 35, -15, 7, 55, 1, -22};
        int rotations = 3;

        shiftLeft(array, rotations);

        System.out.println(Arrays.toString(array));
    }

    private static void shiftLeft(int[] array, int d) {
        //a lot of logic
        for (int iterationNumber = 1; iterationNumber <= d; iterationNumber++) {
            int temp = array[0];

            for (int i = 0; i <= array.length - 2; i++) {
                array[i] = array[i + 1];
            }

            array[array.length - 1] = temp;
        }
    }
}
