package com.lseg.enums;

public enum Season {
    SUMMER("very hot"), //asta e locul in care mi-am creat instanta de Season
    FALL("very rainy"),
    WINTER,
    SPRING; //sunt instante de Season

    private String description;

    Season(String description) { //e private by default
        this.description = description;
    }

    Season() { //e private by default
        this("same season all the time, this is glaobal warming all about");
    }

    public String getDescription() {
        return description;
    }

    public void describe() {
        //enumul este un tip ce se poate folosi intr-un switch
        //this in orice metoda de instanta este chiar obiectul care invoca metoda
        switch (this) {
            case WINTER:
                System.out.println("very cold");
                break;
            case SPRING:
                System.out.println("many colors and flowers");
                break;
            case SUMMER:
                System.out.println("very hot");
                break;
            case FALL:
                System.out.println("very rainy");
                break;
        }
    }
}
