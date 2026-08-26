package week1;

import java.util.Scanner;

public class CashChange {
    public static void main(String[] args) {
        //Fråga efter ett helt belopp i kronor och skriv ut hur många hundralappar, tiokronor och enkronor som behövs
        //för att nå beloppet, med så stora valörer som möjligt.
        //Körningsexempel:
        //Belopp: 327
        //327 kr = 3 st 100, 2 st 10, 7 st 1

        Scanner input = new Scanner(System.in);
        System.out.print("Insert amount: ");
        int amount = input.nextInt();
        int hundred = amount / 100;
        int ten = (amount - hundred * 100) / 10;
        int one = amount % 10;
        System.out.print(amount + "kr = " + hundred + " st 100, " + ten + " st 10, " + one + " st 1");
        input.close();
    }
}
