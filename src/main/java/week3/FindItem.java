package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class FindItem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> items = new ArrayList<>();

        items.add("Cheese");
        items.add("Milk");
        items.add("Kitchen paper");
        items.add("Yoghurt");
        items.add("Bread");

        System.out.print("Enter an item: ");
        String search = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equalsIgnoreCase(search)) {
                System.out.println(search + " is at position " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(search + " is not in the list.");
        }
    }
}