package week1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //Fråga efter användarens namn och hälsa tillbaka, med namnet inbakat i meddelandet.
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your name? ");
        System.out.print("Insert your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name +"!");
        sc.close();
    }
}
