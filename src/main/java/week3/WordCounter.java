package week3;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        //Läs in en hel mening från användaren.
        // Räkna hur många gånger varje ord förekommer och skriv ut
        //resultatet. Stora och små bokstäver ska räknas som samma ord.

        String text = "Ciao ciao mamma ciao a mia mamma ad Alghero ciao Alghero";
        String[] myArray = text.toLowerCase().split(" ");
        HashMap<String, Integer> myText = new HashMap<>();

        for (String word : myArray) {
            if (myText.containsKey(word)) {
                myText.put(word, myText.get(word) + 1);
            } else {
                myText.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : myText.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();

            System.out.println(word + " -> " + count);
        }
    }
}
