package com.lseg.classes; //must be the first statement from file

public class Table { //file name must be exactly like the public class name

    //they define state of the object
    String color;

    private int legNumber = 4; //attribute, field

    int lentgh; //cm

    int width; //setWidth, getWidth --> bean naming convention

    int height;

    public void setLegNumber(int legNumber) {
        //any logic
        if (legNumber > 4 || legNumber <= 0) { //
//            throw new IllegalArgumentException("Number of legs must be between 1 and 4");
            System.out.println("Number of legs must be between 1 and 4");
            return;
        }

        this.legNumber = legNumber;
    }

    public int getLegNumber() {
        //this se refera la obiectul cu care apelezi metoda
        return this.legNumber;
    }
}