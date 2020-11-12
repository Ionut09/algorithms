package com.lseg.movie_rental_homework;

import java.util.ArrayList;

public class VideoStoreLauncher {

    public static void main(String[] args) {
        VideoStore store = new VideoStore(new ArrayList<>());

        store.addVideo("Godfather II");
        store.addVideo("The Matrix");
        store.addVideo("The Matrix");
        store.addVideo("Star Wars");
        store.addVideo("Star Wars");
        store.addVideo("Star Wars");

        store.listInventory();

        store.checkOut("Star Wars");
        store.checkOut("The Matrix");

        store.returnVideo("Star Wars");
        store.returnVideo("The Matrix");
        store.listInventory();

    }
}
