package InputBox;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadIntBetween {

    public static int readIntBetween(Scanner scanner, String prompt, int min, int max) {

        while (true) {
            try {
                System.out.print(prompt);
                int value = scanner.nextInt();
                scanner.nextLine();

                if (value >= min && value <= max) {
                    return value;
                }

                System.out.printf("Value should be between %d och %d%n", min, max);

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
    }
}