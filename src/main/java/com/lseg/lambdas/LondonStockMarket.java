package com.lseg.lambdas;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LondonStockMarket {

    static Trader raoul = new Trader("Raoul", "Cambridge");

    static Trader mario = new Trader("Mario", "Milan");

    static Trader alan = new Trader("Alan", "Cambridge");

    static Trader brian = new Trader("Brian", "Cambridge");

    static List<Transaction> transactions = List.of(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    /**
     * 1. Find all transactions in the year 2011 and sort them by value (small to high).
     * 2. What are all the unique cities where the traders work?
     * 3. Find all traders from Cambridge and sort them by name.
     * 4. Return a string of all traders’ names sorted alphabetically.
     * 5. Are any traders based in Milan?
     * 6. Print all transactions’ values from the traders living in Cambridge.
     * 7. What’s the highest value of all the transactions?
     * 8. Find the transaction with the smallest value.
     */

    public static void main(String... args) {
        //1
        transactions.stream()
                    .filter(transaction -> transaction.getYear() == 2011) // boolean test(Transaction t);
                    // int compare(Transaction o1, Transaction o2);
//                    .sorted(Comparator.comparing(Transaction::getValue))
                    .sorted((t1, t2) -> t1.getValue() - t2.getValue())
                    .forEach(System.out::println);

        //2
        transactions.stream()
                    .map(tr -> tr.getTrader().getCity())
//                    .distinct()
                    .forEach(System.out::println);

        Set<String> names = transactions.stream()
                                            .map(tr -> tr.getTrader().getCity())
//                                          .distinct()
                                            .collect(Collectors.toSet());
        System.out.println("stringSet = " + names);

        //3   Print all transactions’ values from the traders living in Cambridge.
        transactions.stream()
                    .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                    .peek(System.out::print)
                    .map(Transaction::getValue)
                    .forEach(System.out::println);
    }
}
