package com.lseg.generics;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.isNull;

public class Wildcards {

    public static void main(String... args) {

        List<Integer> intList = List.of(1, 2, 3);
        printNumbers(intList);

        List<Number> numbers = List.of(1, 2, 3);
        printNumbers(numbers);

        List<Object> objects = List.of(1, 2, 3);
        printNumbers(objects);

        List<Object> strings = List.of(1, 2, 3);
        printNumbers(objects);
    }

    private static void printNumbers(List<? super Integer> list) {
        String out = isNull(list) ? "null" : list.toString();
        System.out.println(out);
    }

    private static void printAnything(List<?> list) {
        System.out.println(list);
    }

    private static void printStrings(List<? extends String> list) {
        System.out.println(list);
    }
}
