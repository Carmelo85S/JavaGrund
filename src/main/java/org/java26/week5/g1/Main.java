package org.java26.week5.g1;

public class Main {
    public static void main(String[] args) {
        // Skapa en klass Pokemon som beskriver vad varje pokémon har:
        // ett namn, en typ, max-HP och aktuell HP.
        // Välj en rimlig datatyp för varje fält — HP-värdena är tal, inte text.
        // I main: skapa ett objekt av klassen, fyll i fälten för Pikachu och skriv ut namnet och typen.
        // Körningsexempel:
        // Pikachu är av typen Electric
        // Max-HP: 35

        Pokemon pikachu = new Pokemon("Pikachu", Type.ELECTRIC, 35);

        System.out.println(pikachu);
    }
}
