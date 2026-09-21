package org.java26.week4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadAndDisplay {
    public static void main(String[] args) {

        //Write a program that read and display favorite.txt
        Path path = Path.of("favorite.txt");
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Could not load from file");
        }
    }
}
