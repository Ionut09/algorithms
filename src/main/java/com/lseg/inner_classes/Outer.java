package com.lseg.inner_classes;

public class Outer {

        static String name;

    class Inner {

        public void method() {
            name += "ceva";
        }
    }

    static class StaticInner {

        public void method() {
            name += "ceva";
        }
    }


}
