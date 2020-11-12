package com.lseg.inheritance;

public class Zoo {

    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.setWeight(20);
//        animal.eat();

        Dog zdreanta = new Dog();
        zdreanta.setWeight(15);
//        System.out.println(zdreanta.getWeight());
//        zdreanta.eat();
//        zdreanta.bark();
//        zdreanta.walk();

        zdreanta.walk();
//
//        zdreanta.equals(animal);
//        System.out.println(zdreanta.toString());

        System.out.println("=====================");
        Cat kitty = new Cat("fluffy", "maidanez", "20", 4, "Kitty");
        kitty.eat();
        kitty.eat();
    }
}
