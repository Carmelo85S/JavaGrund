package week2;

import java.util.Scanner;

public class CrashTest {
    public static void main(String[] args) {
        //Skriv ett program som tar två tal (som text) och dividerar dem.
        // Flera saker kan gå fel: texten kanske inte är ett tal,
        //eller så är nämnaren noll.
        // Fånga de olika feltyperna och ge ett begripligt meddelande för var och en — utan att
        //programmet kraschar.
        Scanner scanner = new Scanner(System.in);
        int firstNumber = getFirstInput(scanner);
        int secondNumber = getSecondInput(scanner);
        System.out.println("Result: " + divideNumbers(firstNumber, secondNumber));

    }

    public static int getFirstInput(Scanner scanner) {
        while(true){
            try {
                System.out.print("Enter first number: ");
                String firstNum = scanner.nextLine();
                int firstInput = Integer.parseInt(firstNum);
                return firstInput;
            } catch (NumberFormatException e) {
                System.out.println("Input not valid");
            }
        }
    }

    public static int getSecondInput(Scanner scanner) {
        while(true){
            try {
                System.out.print("Enter second number: ");
                String secondNum = scanner.nextLine();
                int secondInput = Integer.parseInt(secondNum);
                return secondInput;
            } catch (NumberFormatException e) {
                System.out.println("Input not valid");
            }
        }
    }

    public static int divideNumbers(int firstNumber, int secondNumber) {
        try {
            return firstNumber / secondNumber;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }
}
