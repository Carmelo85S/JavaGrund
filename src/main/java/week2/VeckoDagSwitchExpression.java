package week2;

import java.util.Scanner;

public class VeckoDagSwitchExpression {
    public static void main(String[] args) {
        //Skriv ett programm som läser ett tal 1 - 7 och skriver ut veckdagen
        //med en switch expression
        //Utoka med ytterligare en switch expression:
        //gruppera 1- 5 som "Vardagar" och 6 - 7 som "Helg
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which day is it?");
        System.out.print("Choose a numer 1 - 7: ");

        int choice = scanner.nextInt();

        if (choice < 1 || choice > 7) {
            System.out.println("Invalid choice");

        } else {
            String dayName = switch (choice) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                default -> "Invalid choice";
            };

            String day = switch (choice) {
                case 1, 2, 3, 4, 5 -> "Vardagar";
                case 6, 7 -> "Helg";
                default -> "Invalid input";
            };

            System.out.println("Today is " + dayName + " and is " + day);
        }
    }
}
