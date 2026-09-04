package InputBox;

import java.util.Scanner;

public class InputBox {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = Input.readInt(scanner, "Enter your age: ");

        int grade = Input.readIntBetween(
                scanner,
                "Enter a grade (1-5): ",
                1,
                5
        );

        double weight = Input.readDouble(
                scanner,
                "Enter your weight: "
        );

        double temperature = Input.readDoubleBetween(
                scanner,
                "Enter a temperature (35.0 - 42.0): ",
                35.0,
                42.0
        );

        System.out.println();
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Weight: " + weight);
        System.out.println("Temperature: " + temperature);

        scanner.close();
    }
}