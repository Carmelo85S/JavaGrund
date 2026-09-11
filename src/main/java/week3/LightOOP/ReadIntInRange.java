package week3.LightOOP;

import java.util.Scanner;

public class ReadIntInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 5;
        int choice = 0;
        while(true) {
            System.out.println("Enter a number between 1 and 5");
            try {
                String userInput = scanner.nextLine().trim();
                choice = Integer.parseInt(userInput);
                if (choice < min || choice > max) {
                    System.out.println("Invalid input");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
            System.out.println("Choice is: "+ choice);
        }
    }
}

