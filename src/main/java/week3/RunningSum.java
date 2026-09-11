package week3;

import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        //Read numbers one at a time and keep a running total.
        // When the user types klar, stop taking input and print the total.
        // If the user enters something that is not a number (and is not "done"),
        // skip that input and display a message.
        // The program must never crash, and the total must remain correct.

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true){

            try {

                System.out.print("Enter a number: ");
                String userInput = scanner.nextLine().trim();
                if(userInput.equalsIgnoreCase("done")){
                    break;
                }
                int number = Integer.parseInt(userInput);
                sum += number;
            } catch (NumberFormatException e){
                System.out.println("Not a number");
            }
        }
        System.out.println("Total: " + sum);
    }
}
