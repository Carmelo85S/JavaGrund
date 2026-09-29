package org.java26.week5.g4;

public class Main {
    public static void main(String[] args) {
        // Att skapa objektet tomt och sätta ett fält i taget är omständligt. Ge Pokemon en constructor som tar emot namn,
        //typ och max-HP och fyller i fälten åt dig. Aktuell HP ska börja på samma värde som max-HP — en ny pokémon är
        //fullt frisk.
        //Skapa nu objekten på en rad i stället för fyra. När en parameter heter samma som ett fält behöver du kunna skilja
        //dem åt — ta reda på hur.
        //Körningsexempel:
        //Pikachu skapad: 35/35 HP
        //Charizard skapad: 78/78 HP

        Pokemon pikachu = new Pokemon("Pikachu", Type.ELECTRIC, 35);
        Pokemon charizard = new Pokemon("Charizard", Type.FIRE, 78);

        System.out.println(pikachu);
        System.out.println(charizard);

    }
}
