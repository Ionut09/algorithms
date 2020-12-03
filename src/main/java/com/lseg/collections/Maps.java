package com.lseg.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Maps {

    public static void main(String... args) {
        HashMap<String, Student> catalog = new HashMap<>();

        Student john = new Student(21, "John");
        catalog.put("John", john);
        catalog.put("Bob", john);
        catalog.put("Archie", new Student(20, "Archie"));
        catalog.putIfAbsent("Archie", new Student(20, "Archie2"));

        System.out.println(catalog);

        Student bob = catalog.get("Bob");
        System.out.println("bob" + bob);

        Set<java.util.Map.Entry<String, Student>> entries = catalog.entrySet();
        for (java.util.Map.Entry<String, Student> entry : entries) {
            System.out.print(entry.getKey() + " = ");
            System.out.println(entry.getValue());
        }

        Collection<Student> values = catalog.values();

        catalog.containsKey("Bob");//true
        catalog.containsValue(john);//true
        catalog.remove("John");
        System.out.println(catalog);

        catalog.size();//nr de perechi
        catalog.isEmpty(); //daca nu are nicio perechi

        TreeMap<String, Student> sortedCatalog = new TreeMap<>();
        sortedCatalog.putAll(catalog);
        System.out.println(sortedCatalog);
    }
}
