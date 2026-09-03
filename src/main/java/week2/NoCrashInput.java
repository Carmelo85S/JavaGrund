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
        int myAge = userInput(scanner);
        System.out.println("You are "+ myAge + " years old.");


    }
    public static int userInput(Scanner scanner){
        while(true){
            System.out.println("Enter you age");
            try{
                int age = scanner.nextInt();
                scanner.nextLine();
                return age;
            }catch(InputMismatchException e){
                System.out.println("Not a valid input. Write a valid number...");
                scanner.nextLine();
            }
        }
    }
}
