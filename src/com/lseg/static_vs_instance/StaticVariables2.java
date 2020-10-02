package com.lseg.static_vs_instance;

public class StaticVariables2 {

    public static void main(String[] args) {
        Counter i = new Counter();
        Counter i1 = new Counter();
        Counter i2 = new Counter();
        Counter i3 = new Counter();
        Counter i4 = new Counter();
        Counter i5 = new Counter();
        Counter.counter++;

        System.out.println(Counter.counter);
        System.out.println(i4.getCounter()); //nu apelam asa metodele statice
        System.out.println(i2.getCounter());
        System.out.println(Counter.getCounter()); // ci asa

    }
}

class Counter {

    static int counter;//specific to class - for all class instances

    public Counter() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
