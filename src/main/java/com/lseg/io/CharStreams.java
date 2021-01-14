package com.lseg.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class CharStreams {

    public static final int BUFFER_SIZE = 1024 * 1024 * 10;

    public static final String INPUT_TXT = "./src/main/resources/input.txt";

    public static final String OUTPUT_TXT = "./src/main/resources/output.txt";

    public static void main(String... args) {

        long start = System.currentTimeMillis();
        //inchiderea resurselor intotdeauna declanseaza flush-ul pt buffer
        try (BufferedReader in = new BufferedReader(new FileReader(INPUT_TXT), BUFFER_SIZE);
             BufferedWriter out = new BufferedWriter(new FileWriter(OUTPUT_TXT, true), BUFFER_SIZE)) {

            String line;

            while ((line = in.readLine()) != null) {
//                System.out.println((char) line);
                out.write(line);
                out.newLine();
            }
            out.flush();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println(String.format("File read and write took: %.2f ", (System.currentTimeMillis() - start) / 1000.0));
    }
}
