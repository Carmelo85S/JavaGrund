package week2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100)+1;
        System.out.println("The program generate a secret number between 1 and 100.");
        System.out.println("Your goal is to guess the right number.");

        int guess;
        do{
            System.out.print("Guess the secret number: ");
            guess = scanner.nextInt();

            System.out.println("You guessed: "+ guess);
            if(guess < secretNumber){
                System.out.println("You guess is less than the secret number.");
            } else if(guess > secretNumber){
                System.out.println("Your guess is higher that the secret number.");
            } else {
                System.out.println("YOU GUESSED RIGHT");
            }

        }  while (guess != secretNumber);

    }

}
