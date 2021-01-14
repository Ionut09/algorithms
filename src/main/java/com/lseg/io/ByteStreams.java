package com.lseg.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreams {

    public static void main(String... args) throws FileNotFoundException {

        try (InputStream in = new FileInputStream("./src/main/resources/input.txt");
             OutputStream out = new FileOutputStream("./src/main/resources/output.txt")) {

            int byteRead;

            while ((byteRead = in.read()) != -1) { //-1 semnaleaza EOF
//                System.out.println(byteRead);
                out.write(byteRead);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
