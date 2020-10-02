package com.lseg.inheritance;

public class Dog extends Animal { // extends --> Dog is an Animal

    private String breed;

    private int legs;

    private String furrType;

    public Dog() {
        super("canine", true, 10, "white");
    }

    public void walk() {
        System.out.println("Dog walks");
        super.move(5); //--> cea din Animal
        move(5);
    }

    public void bark() {
        System.out.println("Dog bark");
    }

//    public void move(int speed) {
//        System.out.println("Dog moves with speed: "+speed);
//    }

    @Override
    public void move(int s) {
        System.out.println("Dog moves");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getFurrType() {
        return furrType;
    }

    public void setFurrType(String furrType) {
        this.furrType = furrType;
    }
}
