package week1;

import java.util.Scanner;

public class ChangePlace {
    public static void main(String[] args) {
        //Fråga efter två tal och spara dem i var sin variabel. Skriv ut dem, byt sedan innehållet mellan de två
        //variablerna så att den första får den andras värde och tvärtom, och skriv ut dem igen.
        //Klurigt: hur byter du innehållet i två variabler utan att tappa bort det ena värdet på vägen?

        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the first number: ");
        int firstNum = sc.nextInt();

        System.out.print("Insert the second number: ");
        int secondNum = sc.nextInt();

        System.out.println("After input");
        System.out.println("First number = "+ firstNum);
        System.out.println("Second number = "+ secondNum);

        int temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;

        System.out.println("After switch");
        System.out.println("First number = "+ firstNum);
        System.out.println("Second number = "+ secondNum);

        sc.close();
    }
}
