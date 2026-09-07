package week3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FillArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        boolean input = true;
        while (input) {
            System.out.print("Enter a number or digit - quit - to exit: ");

            try {
                String userInput = scanner.nextLine();
                if (userInput.equals("quit")) {
                    input = false;
                    continue;
                }

                int nInput = Integer.parseInt(userInput);

                numbers.add(nInput);

            } catch (NumberFormatException e) {
                System.out.println("Not a number");
            }

        }
        System.out.print(numbers);
    }
}
