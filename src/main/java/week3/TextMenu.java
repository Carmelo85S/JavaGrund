package week3;

import java.util.Scanner;

public class TextMenu {
    public static void main(String[] args) {
        //Build a small text menu with three options (say hello, say goodbye, exit).
        // The program should read the user's choice and only accept a number between 1 and 3.
        //Regardless of what is entered, whether it's letters, an empty line, or a number outside the range,
        // the program should never crash.
        // Instead, it should display a clear message and ask again until a valid choice is entered.

        System.out.println("TEXT MENU");
        System.out.println("[1] - Hello");
        System.out.println("[2] - Goodbye");
        System.out.println("[3] - Exit");

        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            String userInput = sc.nextLine().trim();
            try {
                choice = Integer.parseInt(userInput);
                if (choice < 1 || choice > 3) {
                    System.out.println("Value non allowed");
                    continue;
                }
                switch (choice) {
                    case 1 -> System.out.println("hello");
                    case 2 -> System.out.println("Good bye");
                    case 3 -> {
                        System.out.println("Exit program");
                        return;
                    }
                    default -> {
                        System.out.println("Invalid input");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("input was not a number");
            }
        }
    }
}
