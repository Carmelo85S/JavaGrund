package week3;

import java.util.HashSet;

public class UniqueWord {
    public static void main(String[] args) {
        //Lägg orden "hej, hej, världen, hej, världen" i en HashSet<String>.
        // Skriv ut hur många element setet innehåller och vilka de är.
        // Fundera på varför antalet inte blir fem.

        HashSet<String> text = new HashSet<>();
        text.add("hej");
        text.add("hej");
        text.add("world");
        text.add("hej");
        text.add("world");

        System.out.println("Size: " + text.size());

        System.out.println("World: " + text);


    }
}
