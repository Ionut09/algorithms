package com.lseg.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

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

        boolean hasJohn = group.contains(new Student(22, "John"));
        System.out.println("hasJohn = " + hasJohn);
        System.out.println(group);

//        Student student = Student.builder()
//                                 .age(25)
//                                 .name("Bob")
//                                 .build();


        TreeSet<String> animals = new TreeSet<>();
        animals.add("pig");
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");

        System.out.println(animals);

        String first = animals.first();
        System.out.println(first);

        String last = animals.last();
        System.out.println(last);

        System.out.println("headSet:" + animals.headSet("pig"));
        System.out.println("tailSet:" + animals.tailSet("pig"));
        System.out.println("subSet:" + animals.subSet("dog", "rat")); //exact ca substring

        String higher = animals.higher("pig");      //>
        System.out.println("> than pig = " + higher);

        String ceiling = animals.ceiling("pig");     //>=
        System.out.println(">= than pig = " + ceiling);

        String lower = animals.lower("pig");         //<
        System.out.println("< than pig = " + lower);

        String floor = animals.floor("pig");         //<=
        System.out.println("<= than pig = " + floor);


        System.out.println("subSet:" + animals.subSet("cat", animals.lower("rat"))); //exact ca substring

        group.add(new Student(24, "Andy"));
        group.add(new Student(23, "Andy"));
        StudentComparator studentComparator = new StudentComparator();

        TreeSet<Student> studentsCatalog = new TreeSet<>(studentComparator);
        studentsCatalog.addAll(group);
        System.out.println(studentsCatalog);

        List<Student> sList= new ArrayList<>();
        sList.addAll(group);
        sList.sort(studentComparator);

        Collections.sort(sList, studentComparator);
    }
}
