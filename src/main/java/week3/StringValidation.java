package week3;

import java.util.Scanner;

public class StringValidation {
    public static void main(String[] args) {
        //Ask for a name. A valid name must not be empty and must not consist only of spaces.
        // In both cases, the program should display a message and ask again.
        // When a valid name is entered, greet the person.
        // Keep in mind that an empty line and a name consisting only of spaces should be treated the same way.

        Scanner scanner = new Scanner(System.in);
        readString(scanner, "Enter a name: ");
    }

    public static void readString(Scanner scanner, String prompt) {
        while (true) {
            System.out.println(prompt);
            String userInput = scanner.nextLine().trim();
            if (userInput.isEmpty()) {
                System.out.println("You input cannot be empty");
                continue;
            }
            System.out.println("Hello " + userInput + "!");
            return;
        }
    }
}
