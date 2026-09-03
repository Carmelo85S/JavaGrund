package InputBox;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadDoubleBetween {

    public static double readDoubleBetween(Scanner scanner, String prompt, double min, double max) {

        System.out.println(prompt);
        while (true) {
            try {
                System.out.print("Enter a number: ");
                double value = scanner.nextDouble();
                scanner.nextLine();

                if (value >= min && value <= max) {
                    System.out.println("You entered: "+ value);
                    return value;
                }
                System.out.printf("Value should be between %.2f och %.2f%n", min, max);

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

}
