package week2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(10)+1;
        int guess;
        do{
            System.out.print("Guess the secret number: ");
            guess = scanner.nextInt();

            if(guess < secretNumber){
                System.out.println("You guess is less");
            } else if(guess > secretNumber){
                System.out.println("Your guess is high");
            } else {
                System.out.println("RIGHT");
            }

        }  while (guess != secretNumber);

    }

}
