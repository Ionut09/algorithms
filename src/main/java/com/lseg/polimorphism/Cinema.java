package com.lseg.polimorphism;

import java.util.Random;

public class Cinema {

    public static void main(String[] args) {
        Movie movie0 = new Inception();

        //referinta --> Movie - acesta e tipul care dicteaza ce metode pot apela 
        //obiectul --> Inception

        movie0.plot();

        for (int i = 1; i <= 5; i++) {
            Movie movie = getRandomMovie(); //nu stim niciodata ce obiect e in spatele unei referinte
            System.out.println("Movie - "
                    + movie.getName() + " --> "
                    + movie.plot());//plot care va fi executata nu e cunoscuta decat la runtime
        }
        var s1 = "abc";
        System.out.println(s1);
        var primul = new COntainedObject();
        Second second = new Second(primul);

        second.aMethod();

        primul.justAMethod();

        second.getCOntainedObject().justAMethod();

        String initialString = "aSImpleString";
        String s = initialString.toUpperCase().replace("S", "A").toLowerCase();
        System.out.println("s = " + s);
        System.out.println("initialString = " + initialString);

    }

    private static Movie getRandomMovie() {
        int randomNumber = new Random().nextInt(3) + 1; //   )

        switch (randomNumber) {
            case 1:
                return new Inception();
            case 2:
                return new ShutterIsland();
            case 3:
                return new TheWolfFromWallStreet();
//            case 4:
//                return "dsidjs"; //no work
            default:
                return null;
        }
    }
}

class COntainedObject {

    public void justAMethod() {
        System.out.println("DO nothing");
    }
}


class Second {

    private COntainedObject COntainedObject;

    public Second(COntainedObject COntainedObject) {
        this.COntainedObject = COntainedObject;
    }

    public void aMethod() {
        COntainedObject.justAMethod();
    }

    public COntainedObject getCOntainedObject() {
        return COntainedObject;
    }
}


abstract class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot";
    }

    public String getName() {
        return name;
    }
}

class Inception extends Movie {

    public Inception() {
        super("Inception");
    }

    public String plot() {
        return "People get into other people dreams";
    }
}

class ShutterIsland extends Movie {

    public ShutterIsland() {
        super("ShutterIsland");
    }


//    public String plot() {
//        return "Some people stuck on an island";
//    }
}

class TheWolfFromWallStreet extends Movie {

    public TheWolfFromWallStreet() {
        super("TheWolfFromWallStreet");
    }


    public String plot() {
        return "A man becomes rich on Wall Street";
    }
}