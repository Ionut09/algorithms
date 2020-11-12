package com.lseg.abstract_methods;

public abstract class Animal {

    private String species;
    private int weight;

    public Animal(String species, int weight) {
        this.species = species;
        this.weight = weight;
    }
    //can be only inside an abstract class
    public abstract void eat(); //just head, without body

    /*
       method body <==> {  code }
     */
}
