package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class FillUntilQuit {
    public static void main(String[] args) {
        //Be användaren mata in tal ett i taget och spara dem i en ArrayList<Integer>. När användaren skriver
        //klar: skriv ut hur många tal som matades in och deras summa.
        // Programmet får inte krascha på bokstäver.
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();

        boolean running = true;

        while(running) {
            System.out.println("Enter a number or digit - quit - to exit");
            try {
                String input = scanner.nextLine();
                if (input.equals("quit")) {
                    running = false;
                    continue;
                }
                int userInput = Integer.parseInt(input);
                number.add(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Input not valid.");
            }
        }

        System.out.println("Number in list : "+ number.size());

        int sum = 0;
        for(int numberInList : number){
            sum = sum + numberInList;
        }

        System.out.println("Sum = : " + sum);
    }
}
