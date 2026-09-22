package org.java26.week4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreeFavorites {
    public static void main(String[] args) {
        // Ask the user for three favorite things, one at a time.
        // Save all three to favorites.txt, one per line.
        // Then read the file back and print the items numbered.
        // This completes the full cycle: input from the user, output to the file, input from the file, and output to the screen.

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        Path path = Path.of("favorites-things.txt");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.print("Favorite thing n" + (i + 1) + " : ");
                String thing = scanner.nextLine().trim();
                list.add(thing);
            }
            Files.write(path, list);

            List<String> readList = Files.readAllLines(path);
            System.out.println("My favorites: ");
            for (int i = 0; i < readList.size(); i++) {

                System.out.println((i + 1) + "-" + readList.get(i));
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
