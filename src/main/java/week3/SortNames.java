package week3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortNames {
    public static void main(String[] args) {
        //Lagra fem namn i oordning i en ArrayList<String>.
        //Sortera listan i bokstavsordning och skriv ut den.

        ArrayList<String> names = new ArrayList<>();
        names.add("Carmelo");
        names.add("Angelica");
        names.add("Isabella");
        names.add("Alexander");

        System.out.println("---SORTED---");
        Collections.sort(names);
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("---REVERSE ORDER---");
        Collections.sort(names, Collections.reverseOrder());
        for (String name : names) {
            System.out.println(name);
        }


    }
}
