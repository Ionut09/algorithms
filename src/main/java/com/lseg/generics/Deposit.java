package com.lseg.generics;

import java.util.ArrayList;

public class Deposit {

    public static void main(String... args) {
        Box box = new Box();

        box.setContent("str");
        box.setContent(new ArrayList<>());
        Object content = box.getContent();
        ArrayList list = (ArrayList) content;
    }
}
