package InputBox;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadDoubleBetween {

    public static double readDoubleBetween(Scanner scanner, String prompt, double min, double max) {

        while (true) {
            try {
                System.out.print(prompt);
                double value = scanner.nextDouble();
                scanner.nextLine();

                if (value >= min && value <= max) {
                    return value;
                }

                System.out.printf("Value should be between %.2foch %.2f%n", min, max);

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
    }

}
