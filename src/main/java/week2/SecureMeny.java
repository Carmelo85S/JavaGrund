package week2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecureMeny {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Krav: allt menyval läses genom en metod som
        //vägrar acceptera annat än ett tal i giltigt intervall;
        //varje menyval bryts ut till sin egen metod; main är kort och läsbar.
        //Testa genom att medvetet mata in bokstäver, tomma rader, decimaler och menyval utanför intervallet. Ingenting
        //får krascha — programmet ska bara fråga igen. Det här är skelettet som inlämning 1 kräver.
        int input = 0;
        do {
            showMenu();
            input = getInput(scanner);
            runAction(scanner, input);
        } while (input != 4);

    }

    public static void showMenu() {
        System.out.println("=======MENU=======");
        System.out.println("1 -Greet");
        System.out.println("2 -Calculate BMI");
        System.out.println("3 -Generate random number");
        System.out.println("4 -Exit");
    }

    public static int getInput(Scanner scanner) {
        while (true) {
            System.out.print("Choose: ");
            try {
                int userInput = scanner.nextInt();
                scanner.nextLine();
                if (userInput >= 1 && userInput <= 4) {
                    return userInput;
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                scanner.nextLine();
            }
        }
    }

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void calculateBmi(Scanner scanner) {
        try {
            System.out.print("Enter your height in cm: ");
            double height = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter your weight in kg: ");
            double weight = scanner.nextDouble();
            scanner.nextLine();

            height = height / 100;

            double bmi = weight / (height * height);

            System.out.printf("Your BMI is %.2f%n", bmi);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numbers.");
            scanner.nextLine();
        }
    }

    public static void runAction(Scanner scanner, int userInput) {
        switch (userInput) {
            case 1 -> sayHello();
            case 2 -> calculateBmi(scanner);
            case 3 -> System.out.println("Random");
            case 4 -> System.out.println("Exit");
            default -> System.out.println("Invalid input");
        }
    }
}
