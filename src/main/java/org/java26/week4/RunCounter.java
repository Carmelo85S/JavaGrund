package org.java26.week4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RunCounter {
    public static void main(String[] args) {
        //The Counter That Remembers
        //Write a program that keeps track of how many times it has been run.
        //When the program starts, it should read the previous count from
        //`count.txt` if the file exists, increase the count by one, print the new number,
        //and save it back to the file.
        //The first time you run the program, the file does not exist.
        // In that case, the counter should start at `1` without causing the program to crash.

        Path path = Path.of("count.txt");
        int count = 0;
        try {
            if (Files.exists(path)) {
                String data = Files.readString(path);
                count = Integer.parseInt(data.trim());
            } else {
                count = 0;
            }
            count++;
            System.out.println(count);

            Files.writeString(path, String.valueOf(count));

        } catch (IOException e) {
            System.out.println("Cannot read or write the file.");
        }
    }
}

