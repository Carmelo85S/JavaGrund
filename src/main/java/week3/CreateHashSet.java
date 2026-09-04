package week3;

import java.util.HashSet;
import java.util.Scanner;

public class CreateHashSet {
    public static void main(String[] args) {
        //create an HashSet string and add names
        HashSet<String> names = new HashSet<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert a name: ");
        String input = scanner.nextLine();

        names.add("Anna");
        names.add("Anna");
        names.add("Marco");
        names.add("Lucio");

        if (names.contains(input)) {
            System.out.println("Already present");
        } else {
            System.out.println("Added");
            names.add(input);
        }

        System.out.println(names);
        scanner.close();
    }
}
