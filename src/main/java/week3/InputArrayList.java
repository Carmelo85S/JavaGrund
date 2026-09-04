package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class InputArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        //insert five names and print
        for(int i = 0; i < 5; i++){
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            names.add(name);
        }
        for(String listedNames : names){
            System.out.println(listedNames);
        }
    }
}
