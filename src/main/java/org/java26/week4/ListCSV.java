package org.java26.week4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ListCSV {
    public static void main(String[] args) throws IOException {

        // Du har en List<String[]> där varje element är en person med tre fält:
        // namn, stad och ålder.
        // Spara lista till people.csv
        // så att varje person blir en rad och fälten skiljs åt med komma.
        // Öppna filen efteråt och kontrollera att den ser ut som körningsexemplet.

        Path path = Path.of("people.csv");

        List<String[]> list = new ArrayList<>();

        list.add(new String[]{"Carmelo", "Stockholm", "41"});
        list.add(new String[]{"Angelica", "Stockholm", "36"});
        list.add(new String[]{"Isabella", "Stockholm", "5"});
        list.add(new String[]{"Alexander", "Stockholm", "4"});

        List<String> lines = new ArrayList<>();

        for (String[] person : list) {
            lines.add(String.join(",", person));
        }

        Files.write(path, lines);

        // Läs people.csv och bygg upp en List<String[]> igen,
        // ett element per rad.
        // Skriv sedan ut varje person i ett snyggt format.
        // Round-trippen ska ge tillbaka exakt samma data du sparade.

        List<String> readLines = Files.readAllLines(path);
        List<String[]> people = new ArrayList<>();

        for (String line : readLines) {
            String[] person = line.split(",");
            people.add(person);
        }

        // Print the reconstructed data
        for (String[] person : people) {
            System.out.println(
                    "Name: " + person[0] + ", City: " + person[1] + ", Age: " + person[2]
            );
        }
    }
}