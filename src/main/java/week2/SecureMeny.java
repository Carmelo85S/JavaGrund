package week2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecureMeny {
    public static void main(String[] args) {

        //Krav: allt menyval läses genom en metod som
        //vägrar acceptera annat än ett tal i giltigt intervall;
        //varje menyval bryts ut till sin egen metod; main är kort och läsbar.
        //Testa genom att medvetet mata in bokstäver, tomma rader, decimaler och menyval utanför intervallet. Ingenting
        //får krascha — programmet ska bara fråga igen. Det här är skelettet som inlämning 1 kräver.

        Scanner scanner = new Scanner(System.in);
        int input = 0;
        do {
            showMenu();
            input = getInput(scanner);
            runAction(input);
            ;
        } while (input != 4);

    }

    public static void showMenu() {
        System.out.println("=======MENU=======");
        System.out.println("1 -Greet");
        System.out.println("2 -Calculate BMI");
        System.out.println("3 -Generate random number");
        System.out.println("4 -Exit");
    }

    public static int getInput(Scanner scanner) {
        while (true) {
            System.out.print("Choose: ");
            try {
                int userInput = scanner.nextInt();
                scanner.nextLine();
                if(userInput >= 1 && userInput <= 4){
                    System.out.println("Welcome");
                }
                return userInput;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                scanner.nextLine();
            }
        }
    }

    public static void runAction(int userInput){
        switch(userInput){
            case 1 -> System.out.println("Hello");
            case 2 -> System.out.println("BMI");
            case 3 -> System.out.println("Random");
            case 4 -> System.out.println("Exit");
            default -> System.out.println("Invalid input");
        }
    }
}
