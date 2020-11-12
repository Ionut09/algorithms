package com.lseg.inheritance;

public class Animal {

    private String species;

    private boolean brain;

    private double weight;

    private String color;

    //private boolean legs;

//    public Animal() {
//    }

    public Animal(String species, boolean brain, double weight, String color) {
        super();
        this.species = species;
        this.brain = brain;
        this.weight = weight;
        this.color = color;
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void move(int speed) {
        System.out.println("Animal moves with speed: "+speed);
    }


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isBrain() {
        return brain;
    }

    public void setBrain(boolean brain) {
        this.brain = brain;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
