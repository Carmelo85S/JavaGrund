package week3;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        //Write a program that reads an integer and prints its double value.
        // Regardless of whether the input succeeds or produces an error,
        // the program must always finish by printing the line Bearbetning klar.
        // This should also happen when the user enters invalid input.
        // Run the program with both valid and invalid input and confirm that the final line is always printed.

        Scanner scanner = new Scanner(System.in);

        try {
            String userInput = scanner.nextLine().trim();
            System.out.print("Enter a number: ");
            int value = Integer.parseInt(userInput);
            int doubleValue = value * 2;
            System.out.println("Double value is: " + doubleValue);
        } catch (NumberFormatException e) {
            System.out.println("Input is not a number");
        } finally {
            System.out.println("All clear");
        }
    }
}
