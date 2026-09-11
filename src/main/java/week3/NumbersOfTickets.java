package week3;

import java.util.Scanner;

public class NumbersOfTickets {
    public static void main(String[] args) {

        // Ask the user how many tickets they want to buy.
        // The answer must be a positive integer (at least 1).
        // Negative numbers, zero, letters, and empty lines must be rejected.
        // When a valid number is entered, print it.

        Scanner sc = new Scanner(System.in);

        System.out.println("How many tickets do you want to buy?");

        int choice;

        while (true) {
            String userInput = sc.nextLine().trim();

            try {
                choice = Integer.parseInt(userInput);
                if (choice < 1) {
                    System.out.println("You must buy at least 1 ticket.");
                    continue;
                }
                System.out.println("You want to buy " + choice + " tickets.");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a positive whole number.");
            }
        }
    }
}