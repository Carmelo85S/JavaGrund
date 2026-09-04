package InputBox;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public static int readInt(Scanner scanner, String prompt) {

        while (true) {
            try {
                System.out.print(prompt);
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
            }
        }
    }

    public static int readIntBetween(Scanner scanner, String prompt, int min, int max) {

        while (true) {

            int value = readInt(scanner, prompt);

            if (value >= min && value <= max) {
                return value;
            }

            System.out.printf("Value must be between %d and %d.%n", min, max);
        }
    }

    public static double readDouble(Scanner scanner, String prompt) {

        while (true) {
            try {
                System.out.print(prompt);
                double value = scanner.nextDouble();
                scanner.nextLine();
                return value;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a decimal number.");
                scanner.nextLine();
            }
        }
    }

    public static double readDoubleBetween(Scanner scanner, String prompt, double min, double max) {

        while (true) {

            double value = readDouble(scanner, prompt);

            if (value >= min && value <= max) {
                return value;
            }

            System.out.printf("Value must be between %.2f and %.2f.%n", min, max);
        }
    }
}