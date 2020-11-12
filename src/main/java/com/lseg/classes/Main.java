package com.lseg.classes;

public class Main {

    public static void main(String[] args) {

        Table desk = new Table(); //Created a custom data type
        //classes are developer defined data type
        //Table() --> constructor invocation, can be invoked only with `new` keyword

        System.out.println("Gabi's desk color before setting explicit values: " + desk.color + ", legs: " + desk.getLegNumber() + ", height:" + desk.height);


        desk.color = "black"; //attributes are called only with name, without parentheses
        desk.setLegNumber(4);
        desk.height = 70;
        desk.lentgh = 120; //cm
        desk.width = 60; //cm

        Table kitchenTable = new Table();
        kitchenTable.color = "white";
        kitchenTable.setLegNumber(4);
        kitchenTable.height = 80;
        kitchenTable.lentgh = 200; //cm
        kitchenTable.width = 70; //cm

        System.out.println("Gabi's desk color: " + desk.color + ", legs: " + desk.getLegNumber() + ", height:" + desk.height);
        System.out.println(
                "Gabi's kitchen table color: " + kitchenTable.color + ", legs: " + kitchenTable.getLegNumber() + ", height:" + kitchenTable.height);

//        boolean hasLegNumberBeenSet = gabiDesk.setLegNumber(100);
//        if(hasLegNumberBeenSet){
//            //do what it takes
//        }

//        System.out.println(gabiDesk.getLegNumber()); //returneze valoarea lui legNumber specifica obiectului gabiDesk

//        float oVariabila; //locala
//        System.out.println("oVariabila = " + oVariabila);
    }
}
