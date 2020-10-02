package com.lseg.composition;

public class Office {

    public static void main(String[] args) {
//        Component component = new Component("Dell", "X220");
        //cum arata componenta asta ????

        Case aCase = new Case("Dell", "X220", 800, "black");
        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("LG", "20XM330", 23, resolution);
        Motherboard motherboard = new Motherboard("Dell", "ABC", 2, 2, "dedicated");

        PC myPc = new PC(aCase, monitor, motherboard);

        myPc.start();
    }
}
