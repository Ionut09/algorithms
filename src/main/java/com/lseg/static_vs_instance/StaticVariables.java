package com.lseg.static_vs_instance;

public class StaticVariables {

    public static void main(String[] args) {
        Cat kitty = new Cat("Kitty");
        Cat fluffy = new Cat("Fluffy");
        Cat bonyy = new Cat("Bonyy");

        System.out.println(kitty.name);
        System.out.println(fluffy.name);

        System.out.println(Cat.name);//asa trebuie apelate variabilele statice
    }

}


class Cat {

    public static String name;

    public Cat(String name1) {
        Cat.name = name1;
    }

}