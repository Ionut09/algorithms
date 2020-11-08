package com.lseg.enums;

import java.time.DayOfWeek;
import java.util.Scanner;

public class DaylyRoutine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day: ");
        DayOfWeek day = DayOfWeek.valueOf(sc.nextLine().trim().toUpperCase());

        switch (day) {
            case MONDAY: //An enum switch case label must be the unqualified name of an enumeration constant
                System.out.println("Go to gym");
                break;
            case FRIDAY:
                System.out.println("Go to weekend");
                break;
            case WEDNESDAY: //toate
                //no need for defult
        }
    }
}
