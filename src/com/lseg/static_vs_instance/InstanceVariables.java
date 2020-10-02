package com.lseg.static_vs_instance;

public class InstanceVariables {

    public static void main(String[] args) {
        Catty kitty = new Catty("Kitty");
        Catty fluffy = new Catty("Fluffy");

        System.out.println(kitty.getName());
        System.out.println(fluffy.getName());
    }
}

class Catty {

    private String name;

    public Catty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
