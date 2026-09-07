package week3;

import java.util.HashMap;
import java.util.Scanner;

public class TelefonBook {
    public static void main(String[] args) {
        //Skapa en HashMap<String, Integer> som kopplar namn till ålder. Lägg in fyra personer.
        //Fråga användaren efter ett namn och skriv ut personens ålder.

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> book = new HashMap<>();

        book.put("Isabella", 6);
        book.put("Carmelo", 41);
        book.put("Angelica", 36);
        book.put("Alex", 4);

        System.out.print("How old is....write a name: ");
        boolean running = true;
        while(running) {
            try {
                String userInput = scanner.nextLine();
                if (!book.containsKey(userInput)) {
                    throw new IllegalArgumentException(
                            userInput + " is not in the list"
                    );
                }
                System.out.println(userInput + " is " + book.get(userInput) + " years old");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
