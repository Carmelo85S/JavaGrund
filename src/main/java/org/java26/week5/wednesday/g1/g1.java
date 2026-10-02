package org.java26.week5.wednesday.g1;

public class g1 {
    public static void main(String[] args) {
        // Start with your Pokémon class from L8.
        // Ensure that all fields are hidden so that nothing outside the class can modify them directly.
        // Then, add read access so that the name and current HP can be read from outside the class.
        // Write a small test program that creates a Pokémon and prints its name and HP.

        Pokemon pikachu = new Pokemon("Pikachu", 35, Type.FIRE);

        System.out.println("Name: " + pikachu.getName());
        System.out.println("Current hp: " + pikachu.getCurrentHp());

        // Pikachu max-HP: 35
        // Försöker sätta HP = -50 -> HP blir 0
        pikachu.setCurrentHp(-50);
        System.out.println("Current hp1: " + pikachu.getCurrentHp());

        // Försöker sätta HP = 9999 -> HP blir 35
        pikachu.setCurrentHp(9999);
        System.out.println("Current hp: " + pikachu.getCurrentHp());
    }
}
