package com.lseg.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

import lombok.SneakyThrows;

import static com.lseg.io.PathOperations.INPUT_PATH;
import static java.nio.file.Files.newBufferedReader;
import static java.nio.file.Files.newBufferedWriter;

public class FilesOperations {

    public static void main(String... args) throws Exception {
        Path p = Paths.get(INPUT_PATH);

        //verify existence
        System.out.println("input.txt exists: " + Files.exists(p, LinkOption.NOFOLLOW_LINKS));

        //verify permissions
        boolean permissions = Files.isWritable(p) && Files.isRegularFile(p) && Files.isReadable(p);
        System.out.println("permissions = " + permissions);

        Path out = p.getParent().resolve("output.txt");

        //delete
        Files.delete(out);

        // copy
        Files.copy(p, out, StandardCopyOption.REPLACE_EXISTING);

        // move
        Files.move(p, out, StandardCopyOption.REPLACE_EXISTING);

        //create a File
//        Files.createFile(p); //FileAlreadyExistsException

        //verific daca intr-un folder am un fisier care incepe cu in
        Path currentFolder = Paths.get(".");
        Files.walk(currentFolder, 10) //Stream<Path>
//           .peek(System.out::println)
             .map(path -> path.getFileName())
             .filter(filename -> filename.toString().toLowerCase().startsWith("in"))
             .forEach(System.out::println);

//        BufferedReader bufferedReader = newBufferedReader(p);
//        BufferedWriter bufferedWriter = newBufferedWriter(p);

        //getting file content as Stream<String> --> adica ala Iterator
        Files.lines(p)
             .map(String::toLowerCase)
             .sorted()
             .forEach(line -> write(out, line));

        Files.lines(Paths.get("file.csv"))
             .map(line->line.split(","))
             //mapare cu obiecte obiecte Java
//           .flatMap(Arrays::stream)
    }

    @SneakyThrows
    static void write(Path out, String line) {
        Files.writeString(out, line, StandardOpenOption.APPEND);
        Files.writeString(out, "\n", StandardOpenOption.APPEND);
    }
}
