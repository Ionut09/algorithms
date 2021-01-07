package com.lseg.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReferences {

    public static void main(String... args) {
        //String apply(Trader t)
//        Function<Trader, String> mapperFunction = trader -> trader.getName();
        Function<Trader, String> mapperFunction = Trader::getName;
        Trader trader = new Trader("John", "Bucharest");
        String name = mapperFunction.apply(trader);
        System.out.println("name = " + name);

        List<String> charsList = List.of("monkey", "cat", "lion")
                                     .stream()
                                     .map(animal -> animal.split(""))
//                                   .map(arrayDeChars -> Stream.of(arrayDeChars))
                                     .flatMap(arrayDeChars -> Arrays.stream(arrayDeChars))
                                     .distinct()
                                     .sorted()
                                     .collect(Collectors.toList());
        System.out.println(charsList);

        List.of("Fred", "Johnny", "Bob", "Alex", "Jamie", "Tedd")
            .stream()
            .filter(str -> str.length() == 4)
            .sorted()
            .limit(2)
            .forEach(n -> System.out.println(n));

//        System.out.println("names = " + names);
    }
}
