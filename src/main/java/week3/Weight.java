package week3;

import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        //Read a weight in kilograms as a decimal number.
        //The user should be able to enter the decimal separator either as a comma or a dot,
        //so both 3,5 and 3.5 should be interpreted as the same number.
        //Letters and invalid input should be rejected, and the user should be asked again.
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("How many kilos do you weigh?");

            try {
                String userInput = scanner.nextLine().trim();
                userInput = userInput.replace(",", ".");
                double weight = Double.parseDouble(userInput);
                System.out.println("Your weight is: " + weight);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Write e.g. 70.5 or 70,5");
            }
        }
    }
}