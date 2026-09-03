package week2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NotOnTheList {
    public static void main(String[] args) {
        //Du har en int[] med fem värden. Skriv ett program som frågar användaren efter ett index och försöker läsa
        //elementet på den platsen. Ligger index utanför arrayen ska programmet fånga felet och säga till — inte krascha.
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];

        for(int i = 0; i < num.length; i++){
            System.out.print("Insert a number: ");
            num[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println(Arrays.toString(num));

        try{
            System.out.print("Choose one index: ");
            int index = scanner.nextInt();
            System.out.println("The number with index "+ index + " is: "+ num[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Not valid index.");
        }catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
