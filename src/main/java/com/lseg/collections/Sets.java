package com.lseg.collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String... args) {
        //creating sets
        Set<Student> group = new HashSet<>();
        Set<Object> setImmutable = Set.of("Alex", "John");

        Student john = new Student(22, "John");
        Student john1 = new Student(22, "John");
        Student john2 = new Student(22, "John");

        System.out.println(john.equals(john1));
        System.out.println(john1.equals(john2));
        System.out.println(john.equals(john2));

        System.out.println(john.hashCode());
        System.out.println(john1.hashCode());
        System.out.println(john2.hashCode());

        group.add(john);
        group.add(john1);
        group.add(john2);

        System.out.println(group);
    }
}
