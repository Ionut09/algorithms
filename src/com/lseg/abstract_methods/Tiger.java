package com.lseg.abstract_methods;

public class Tiger extends Feline {

    public Tiger(int weight) {
        //siberian
        super("Feline", weight);
    }

    @Override
    public void eat() {
        System.out.println("Tigers eat a lot of meat");
    }

}
