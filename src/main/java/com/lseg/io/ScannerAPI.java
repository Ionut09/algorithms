package com.lseg.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ScannerAPI {

    public static void main(String... args) {
        try (Scanner sc = new Scanner(new FileInputStream(CharStreams.INPUT_TXT))) {

            sc.useDelimiter("\\s+");
            double sum = 0;
            while (sc.hasNext()) {
                if (sc.hasNextDouble()) {
                    sum += sc.nextDouble();
                } else {
                    sc.next();
                }
            }
            System.out.println("sum = " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Scanner sc = new Scanner(new FileInputStream(CharStreams.INPUT_TXT))) {
            var tokens = sc.tokens()
                           .filter(token -> token.length() > 5 && Character.isLetter(token.charAt(3)))
                           .sorted()
                           .distinct()
                           .map(String::toUpperCase)
                           .collect(Collectors.toList());

            System.out.println("tokens = " + tokens);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
