package org.java26.week4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class AddLine {
    public static void main(String[] args) throws IOException {
        // Skriv ett program som sparar texten rad ett till log.txt
        // och direkt därefter sparar texten rad två till samma fil

        Path path = Path.of("log.txt");

        Files.writeString(path, "rad ett\n");
        Files.writeString(path, "rad två\n", StandardOpenOption.APPEND);
    }
}