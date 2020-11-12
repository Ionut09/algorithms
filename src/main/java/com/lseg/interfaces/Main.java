package com.lseg.interfaces;

public class Main {

    public static void main(String[] args) {
        Phone phone = new MobilePhone("0761325821");

        //referinta --> Phone - acesta e tipul care dicteaza ce metode pot apela
        //obiectul --> MobilePhone

        phone.powerOn();
        phone.dial("0921972712");
        phone.answer();

        MobileDevice mobileDevice = new MobilePhone("0761325821");
        mobileDevice.charge();

        phone = new DeskPhone();
        phone.powerOn();
        phone.dial("0921972712");
        phone.answer();
    }
}
