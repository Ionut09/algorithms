package com.lseg.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Lists {

    public static void main(String... args) {
        //creating Lists
        List<String> languages = new ArrayList<>(); //LinkedList--> Queue, Deque
        List<String> languagesImmutable = List.of("C", "Java", "PHP");

        //arrays nu sunt resizable, sunt un tip built in Java(ca primivele) ==> nu au metode
        String[] languagesArray = {"C", "Java", "PHP"};
        List<String> languagesImmutable2 = Arrays.asList(languagesArray); //out of scope
        languagesImmutable = List.of(languagesArray);

        //CREATE
        languages.add("Java");
        languages.add("C");
        languages.add("SQL");
        System.out.println("CREATE: " + languages); //[Java, C, SQL]

        languages.add(0, "Javascript");
        System.out.println(languages); //[Javascript, Java, C, SQL]
        System.out.println(languages.size());

        languages.addAll(languagesImmutable2);
        System.out.println(languages); //[Javascript, Java, C, SQL, C, Java, PHP]


        //READ
        //by index
        String java = languages.get(1);
        System.out.println(java);

        //by object
        int indexOfJavascript = languages.indexOf("Javascript");//0 - first occurrence index
        int lastIndexOfC = languages.lastIndexOf("C");//4 - last occurrence index
        boolean hasJava = languages.contains("Java"); //true

        //UPDATE
        languages.set(0, "C");
        System.out.println("UPDATE: " + languages); //[C, Java, C, SQL, C, Java, PHP]

        //DELETE
        //by index
        String remove = languages.remove(1);
        System.out.println("removed = " + remove);
        System.out.println("DELETE: " + languages);

        //capacity == 4000
        //size = 200

        boolean hasRemovedPhp = languages.remove("PHP"); //sterge doar first occurence
        languages.removeAll(List.of("C"));
        System.out.println(languages); //[SQL]

        languages.add("Java");
        languages.add("C");
        languages.add("SQL");
        languages.add("Javascript");
        System.out.println("Reinitialized list: " + languages);

//        badRemoveException(languages);

        //boolean test(String t);
//        languages.removeIf((String language) -> language.startsWith("J") || language.length() > 2);
        oldWayFiltering(languages, "Java");
        System.out.println("After removing Java with Iterator: " + languages);

        Collections.sort(languages);
        System.out.println("SORTED -->" + languages);
        Collections.reverse(languages);

        Collections.sort(languages, Comparator.<String>naturalOrder().reversed());
        System.out.println("SORTED in reverse -->" + languages);
    }

    /**
     * [ 'C, 'Java, C, SQL, C, Java, PHP]
     */
    private static <T> void oldWayFiltering(List<T> list, T element) {
        ListIterator<T> iterator = list.listIterator();

        while (iterator.hasNext()) {
            T next = iterator.next();
            if (element.equals(next)) {
                iterator.remove();
            }
        }
    }

    //not do this
    private static void badRemoveException(List<String> languages) {
        for (String language : languages) {
            if (language.equals("Java")) {
                languages.remove(language);
            }
        }
    }
}
