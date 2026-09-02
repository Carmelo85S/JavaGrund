package week2;

import java.util.Scanner;

public class Method {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = getName(sc);
        System.out.println("Your name is "+ name);
        sc.close();
    }

    public static String getName(Scanner sc){
        System.out.print("Insert your name: ");
        return sc.nextLine();
    }

}
