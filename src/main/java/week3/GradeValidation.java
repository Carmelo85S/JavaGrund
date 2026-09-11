package week3;

import java.util.Scanner;

public class GradeValidation {
    public static void main(String[] args) {
        //Read a grade as an integer between 0 and 100.Put the actual validation in a single helper method
        // that takes a number and determines whether it is valid, instead of spreading the validation throughout the code.
        // Invalid numbers should be rejected with a clear message, and the user should be asked again.
        // The point is to keep the validation in one place, so you can't forget it somewhere.
        Scanner scanner = new Scanner(System.in);
        raedInBetween(scanner, 0, 100, "Enter a grade: ");

    }
    public static void raedInBetween(Scanner scanner,int min, int max, String prompt){
        System.out.print(prompt);
        while(true){
            String userInput = scanner.nextLine().trim();
            try {
                int grade = Integer.parseInt(userInput);
                if(grade < min || grade > max){
                    System.out.println("Out of range");
                }
                System.out.println("Grade is: "+ grade + "/100");

            } catch (NumberFormatException e){
                System.out.println("Input was not a number. Try again");
            }
        }
    }
}
