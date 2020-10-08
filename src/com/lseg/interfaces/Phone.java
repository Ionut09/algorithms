package com.lseg.interfaces;

public interface Phone extends Device{

    public static final int PHONE_INVENTED_YEAR = 1840;

    public final int phoneInventedYear2 = 1840;

    public static int phoneInventedYear3 = 1840;

    static final int phoneInventedYear4 = 1840;

    final int phoneInventedYear5 = 1840;

    static int phoneInventedYear6 = 1840;

    int phoneInventedYear7 = 1840;



    void answer();

    public abstract boolean isRinging();

    public abstract void dial(String number);

    default String whoIsCalling() {  //by default e publica
        phoneSome();
        return "Nobody is calling";
    }

    static int getCallTime() {
        return 0;
    }

    private void phoneSome() {
        System.out.println("SOmthing about phones");
    }
}
