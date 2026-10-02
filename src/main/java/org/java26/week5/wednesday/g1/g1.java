package org.java26.week5.wednesday.g1;

public class g1 {
    public static void main(String[] args) {
        // Start with your Pokémon class from L8.
        // Ensure that all fields are hidden so that nothing outside the class can modify them directly.
        // Then, add read access so that the name and current HP can be read from outside the class.
        // Write a small test program that creates a Pokémon and prints its name and HP.
        Pokemon p = new Pokemon("Pikachu", 100, Type.FIRE);

        System.out.println("Name: " + p.getName());
        System.out.println("Current hp: " + p.getCurrentHp());
    }
}
