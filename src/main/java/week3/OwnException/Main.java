package week3.OwnException;

import java.util.Scanner;

import static week3.OwnException.StringValidationUsername.validateUserame;

public class Main {
    public static void main(String[] args) {
        //Create your own exception class that describes a domain error,
        // such as InvalidUserException, and make it inherit from a suitable existing exception
        // so that the caller is not forced to declare it.
        // Then write a validation method for a username (it must not be empty)
        // that throws your exception with a clear message when the rule is violated.
        // Call the method from a small main with both valid and invalid input,
        // and catch the error so that the message is displayed clearly.

        Scanner scanner = new Scanner(System.in);
        try {
            validateUserame(scanner, "Enter username: ");
        } catch (InvalidUserException e) {
            System.out.println("Details: " + e.getMessage());
        }
    }
}
