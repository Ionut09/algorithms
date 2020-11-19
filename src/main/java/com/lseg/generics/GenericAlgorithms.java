package com.lseg.generics;

import java.util.Arrays;
import java.util.List;

public class GenericAlgorithms {

    public static void main(String... args) {

        Integer[] arr = {1, 2, 3, 8, 9};
        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));

        int max = maxFromRange(List.of(arr), 2, 4);
        System.out.println("max = " + max); //8 dupa swap
    }

    private static <T> void swap(T[] arr, int initial, int other) {
        T temp = arr[initial];
        arr[initial] = arr[other];
        arr[other] = temp;
    }

    private static <T extends Comparable<T>> T maxFromRange(List<T> list, int start, int end) {

        T maxElem = list.get(start);

        for (++start; start < end; ++start) {
            if (maxElem.compareTo(list.get(start)) < 0) {
                maxElem = list.get(start);
            }
        }
        return maxElem;
    }
}
