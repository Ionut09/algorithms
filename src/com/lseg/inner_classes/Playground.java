package com.lseg.inner_classes;

public class Playground {

    public static void main(String[] args) {
        //static inner classes == nested classes
        Outer.StaticInner nested = new Outer.StaticInner();

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        System.out.println(Outer.name);
//        System.out.println(Outer.Inner.name);




    }
}
