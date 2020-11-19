package com.lseg.generics;

import java.util.Arrays;

public class GenericAlgorithms {

    public static void main(String... args) {

        Integer[] arr = {1, 2, 3, 8, 9};
        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);
    }

    private static <T> void swap(T[] arr, int initial, int other) {
        T temp = arr[initial];
        arr[initial] = arr[other];
        arr[other] = temp;
    }
}
