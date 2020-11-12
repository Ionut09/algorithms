package com.lseg.enums;

import java.time.DayOfWeek;

public class SeasonsJoy {

    public static void main(String[] args) {
        boolean a = Season.FALL instanceof Season;
        boolean b = Season.FALL instanceof Enum;

        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.println("name = " + season.name() +
                    ", toString = " + season.toString() +
                    ", ordinal = " + season.ordinal()
                    + " description -> "+season.getDescription());
        }

//        Season newSeason = new Season(); //erorr --> Enum types cannot be instantiated
        //convert din String in enum instance

        Season summerSeason = Season.valueOf("SUMMER");
        System.out.println(summerSeason.equals(Season.SUMMER)); //true
        System.out.println(summerSeason == (Season.SUMMER)); //true

        //because they don't C

        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println("day = " + day);
        }
    }
}
