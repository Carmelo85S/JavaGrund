package week2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NoCrashInput {
    public static void main(String[] args) {
        //Skriv ett program som frågar efter användarens ålder. Skriver användaren något som inte är ett heltal ska
        //programmet säga till och fråga igen — om och om igen tills ett giltigt heltal anges. Lägg logiken i en egen metod
        //som returnerar det giltiga talet.
        //Detta mönster är kursens viktigaste byggsten för krasch-säkra program. Du kommer återanvända det.
        Scanner scanner = new Scanner(System.in);
        int a = 18;
        int b = 99;
        int myAge = userInput(scanner, a, b);
        System.out.println("You are "+ myAge + " years old.");


    }
    public static int userInput(Scanner scanner, int min, int max){
        while(true){
            System.out.println("Enter you age");
            System.out.println("You can choose number between "+ min +" and "+ max);
            try{
                int age = scanner.nextInt();
                scanner.nextLine();
                if (age >= min && age <= max) {
                    return age;
                }
                System.out.println("Number must be between " + min + " and " + max + ".");
            }catch(InputMismatchException e){
                System.out.println("Not a valid input. Write a valid number...");
                scanner.nextLine();
            }
        }
    }
}
