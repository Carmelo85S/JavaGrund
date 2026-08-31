package week2;

import java.util.Scanner;

public class MediumValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;
        int insert = 0;
        double total = 0;

        do {
            System.out.print("Insert a number: ");
            choice = scanner.nextInt();

            if (choice != 0) {
                insert++;
                total += choice;
            }

        } while (choice != 0);

        if (insert > 0) {
            double mediumValue = total / insert;
            System.out.println("Numbers inserted: " + insert);
            System.out.println("Average: " + mediumValue);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}