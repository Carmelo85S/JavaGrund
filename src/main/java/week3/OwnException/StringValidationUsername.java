package week3.OwnException;

import java.util.Scanner;

public class StringValidationUsername {
    public static void validateUserame(Scanner scanner, String prompt)
            throws UserNotFoundException {
        // InvalidUserException is an unchecked exception because it extends RuntimeException.
        // The compiler does not require the caller to catch it or declare it with throws.

        // UserNotFoundException is a checked exception because it extends Exception.
        // The compiler requires the caller to catch it or declare it with throws.
        {
            while (true) {
                System.out.println(prompt);
                try {
                    String userInput = scanner.nextLine().trim();
                    if (userInput.contains("@")) {
                        throw new InvalidUserException("Special characters are not allowed.");
                    }

                    if (userInput.isEmpty()) {
                        throw new UserNotFoundException("Input is empty");
                    } else if (!userInput.equals("carmelo")) {
                        throw new UserNotFoundException("Wrong username");
                    }

                    System.out.println("Welcome back " + userInput);
                    return;

                } catch (InvalidUserException e) {
                    System.out.println("No special characters are allowed.");
                }

            }
        }
    }
}
