package com.lseg.casting_objects;

public abstract class Movie {

    private String name;

    public static void main(String[] args) {
        TheWolfFromWallStreet wolf = new TheWolfFromWallStreet();
        Movie movie = (Movie) wolf; //up-cast  - e redundant
        Object movie2 = new Inception();

        //down-casting
        if (movie2 instanceof Inception) {
            //daca am nevoie sa apelez plot() va trebui sa facem cast
            Inception castedReference = (Inception) movie2;
            System.out.println(castedReference.plot());
        }

        //down-casting
        if (movie2 instanceof Movie) { //true  --> Inception is a Movie
            Movie castedReference = (Movie) movie2;
            System.out.println(castedReference.getName());
        }

        //referinta --> Movie - acesta e tipul care dicteaza ce metode pot apela
        //obiectul --> Inception
    }


    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof Movie)) {
            return false;
        }

        Movie move = (Movie) other;
        return move.name.equals(this.name);
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


class TheWolfFromWallStreet extends Movie {

    public TheWolfFromWallStreet() {
        super("TheWolfFromWallStreet");
    }


    public String plot() {
        return "A man becomes rich on Wall Street";
    }
}
