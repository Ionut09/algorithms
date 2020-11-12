package com.lseg.interfaces;

public class MobilePhone implements Phone, MobileDevice {

    private String myNumber;

    private boolean isRinging;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void charge() {
        System.out.println("Mobile phone is chraging");
    }

    @Override
    public void powerOn() {
        System.out.println("Push the power button");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answer the phone");
        } else {
            System.out.println("Phone doesn;t ring");
        }
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public void dial(String number) {
        System.out.println("Dialing number on mobile phone: " + number);
    }
}
