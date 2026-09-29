package org.java26.week5.g6;

public class Main {
    public static void main(String[] args) {
        // Gör alla fält i Pokemon oåtkomliga utifrån, så att ingen kod utanför klassen kan sätta t.ex. aktuell HP till -9999
        //och köra runt din validering. Lägg sedan till metoder som låter omvärlden *läsa* de värden den behöver (namn,
        //typ, aktuell HP, max-HP).
        //Visa i main att du läser värdena via dina nya metoder, inte direkt från fälten.
        //Körningsexempel:
        //Namn: Squirtle
        //Typ: WATER
        //HP: 44/44


        Pokemon pokemon = new Pokemon("Squirtle", 44, Type.WATER);

        System.out.println("Namn: " + pokemon.getName());
        System.out.println("Typ: " + pokemon.getType());
        System.out.println("HP: " + pokemon.getCurrentHp() + "/" + pokemon.getMaxHp());
    }
}

