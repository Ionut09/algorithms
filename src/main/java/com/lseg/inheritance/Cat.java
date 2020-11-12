package com.lseg.inheritance;

public class Cat extends Animal {

    private String tail;

    private String breed;

    private String claws;

    private int paws;

    private String name;

    public Cat(String tail, String breed, String claws, int paws, String name) {
        super("feline", true, 2, "grey");
        this.tail = tail;
        this.breed = breed;
        this.claws = claws;
        this.paws = paws;
        this.name = name;
    }


    public void purr() {
        System.out.println("Cat purr");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats");
        super.eat();
    }

//    protected void eat(int amount) {
//        System.out.println("Cat eats");
//        super.eat();
//    }
}
