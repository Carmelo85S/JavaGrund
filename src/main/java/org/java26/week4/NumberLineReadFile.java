package org.java26.week4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class NumberLineReadFile {
    public static void main(String[] args) throws IOException {
        //Skapa en textfil för hand i editorn med några rader text.
        // Skriv sedan ett program som läser filen rad för rad
        //och skriver ut varje rad med ett radnummer framför.

        Path path = Path.of("number-line-read-file.txt");
        List<String> list = Files.readAllLines(path);

        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + " - " + list.get(i));
        }
    }
}
