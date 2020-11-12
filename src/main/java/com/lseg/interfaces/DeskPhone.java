package com.lseg.interfaces;

public class DeskPhone implements Phone {

    private String myNumber;

    private boolean isRinging;

    @Override
    public void powerOn() {
        System.out.println("Plug in the phone");
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
        System.out.println("Dialing number on desk phone: " + number);
    }
}
