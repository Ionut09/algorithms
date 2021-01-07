package com.lseg.collections;

public class CharAsciiBacked {

    public static void main(String... args) {
        int Acode = 'A';
        System.out.println(Acode);

        int numberOfSeatsPerRow = 10;
        int numberOfRows = 15;

        int lastRow = 'A' + (numberOfRows - 1);
        System.out.println((char) lastRow);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNumber = 1; seatNumber <= numberOfSeatsPerRow; seatNumber++) {
                System.out.print(row + String.valueOf(seatNumber) + ", ");
            }
            System.out.println();
        }
    }
}
