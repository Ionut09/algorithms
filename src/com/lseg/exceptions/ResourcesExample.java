package com.lseg.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ResourcesExample {

    public static void main(String[] args) throws FileNotFoundException {

        //try-with-resources
        //doar resursele pot fi folosite in acest try-with-resources == implements java.io.Closeable sau java.lang.AutoCloseable
        //resursele sa fie inchise automat, la finalul lui try
        try {
            final BufferedReader reader = new BufferedReader(new FileReader("files/iiifile.txt"));
            System.out.println(reader.readLine());
        } catch (FileNotFoundException exception) {
            System.out.println("Error while reading a line from file");
            throw new RuntimeException(exception);
        } catch (IOException exception) {
            System.out.println("Error while reading a line from file");
        }

        //code that relies on file content


//        finally {
//            try {
//                reader.close();
//            } catch (IOException exception) {
//
//            }
//        }

        /*
        paranteza
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException exception) {
            System.out.println("Error while reading a line from file");
        } finally {
            reader.close();
        }
         */
    }
}
