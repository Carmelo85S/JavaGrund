package week2;

import java.util.Scanner;

public class FizzBuzzGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert a number: ");
        int number = scanner.nextInt();

        if(number%3 == 0 && number%5 == 0){
            System.out.println("Fizz Buzz!");
        }else if(number%3 == 0){
            System.out.println("Fizz!");
        }else if(number%5 == 0) {
            System.out.println("Buzz");
        }
        else{
            System.out.println("Not fizz not buzz");
        }
    }
}
