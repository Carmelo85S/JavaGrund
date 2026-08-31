package week2;

import java.util.Scanner;

public class MediumValue {
    public static void main(String[] args) {
        //Läs in tal från användaren, ett i taget, tills användaren skriver 0.
        // När 0 matas in ska programmet sluta läsa och
        //skriva ut hur många tal som matades in (0 räknas inte) samt deras medelvärde.
        //Hantera fallet att det allra första talet är 0 — då finns inga tal att räkna medelvärde på.
        Scanner scanner = new Scanner(System.in);

        int choice;
        int insert = 0;
        do{
            System.out.print("Insert a number");
            choice = scanner.nextInt();
            insert++;
        }while(choice!=0);
    }
}
