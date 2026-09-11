package week3;

import java.util.Scanner;

public class OutOfBound {
    public static void main(String[] args) {
        //Write a program with an array (int[]) containing three numbers.
        // The program should try both to retrieve the element at a position
        // entered by the user and to interpret another input as a number.
        // Both operations can fail: the position can be outside the array, or the text may not be a number.
        // Catch both types of errors in one place and display one common, clear error message.
        Scanner scanner = new Scanner(System.in);
        int[] number = {1, 2, 3};

        try {
            String userInput = scanner.nextLine().trim();
            int index = Integer.parseInt(userInput);
            if(index < 0){
                System.out.println("Negative number not allowed");
            }

                System.out.println("Element: " + number[index]);

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid input");
        }
    }
}

