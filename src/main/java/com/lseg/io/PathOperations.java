package com.lseg.io;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathOperations {

    public static final String INPUT_PATH = "./src/main/resources/input.txt"; //relativa

    public static final String OUTPUT_TXT = "./src/main/resources/output.txt";

    public static void main(String... args) {
        //creating a Path
        Path p = Paths.get(INPUT_PATH);
//        Path p = Paths.get(INPUT_PATH);

        File file = new File(INPUT_PATH);
        Path path = file.toPath();

//        retrieving information about a path​

        System.out.format("toString: %s%n", p.toString());
        System.out.format("getFileName: %s%n", p.getFileName());
        System.out.format("getNameCount: %s%n", p.getNameCount()); //nr de elemente din Path
        System.out.format("getName: %s%n", p.getName(1));
        System.out.format("getParent: %s%n", p.getParent().toString());
        System.out.format("getRoot: %s%n", p.getRoot()); //null pt ca e relativa
        System.out.format("getRoot: %s%n", p.toAbsolutePath().getRoot()); //rootul filesystem


//        removing redundancies from a path​
        System.out.format("normalize: %s%n", p.normalize());

//        converting a path​
        System.out.format("toAbsolutePath: %s%n", p.toAbsolutePath());

//        joining two paths​
        System.out.format("resolve: %s%n", p.getParent().resolve("output.txt"));

//        creating a path between two paths​
        System.out.format("relativize: %s%n", p.relativize(p.getParent().resolve("output.txt"))); // ../output.txt

//        comparing two paths
        System.out.format("endsWith: %s%n", p.endsWith("input.txt"));

        //verific cu ce incepe fisierul
        System.out.format("fisierul incepe cu in: %s%n", p.getFileName().toString().startsWith("in"));


    }
}
