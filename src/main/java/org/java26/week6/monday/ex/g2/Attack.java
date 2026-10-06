package org.java26.week6.monday.ex.g2;

public class Attack {
    private final String name;
    private final int accuracy;

    public String getName() {
        return name;
    }

    public Attack(String name, int accuracy) {
        this.name = name;
        if (accuracy <= 0 || accuracy > 100) {
            throw new IllegalArgumentException(
                    "Accuracy not int intervall"
            );
        }
        this.accuracy = accuracy;
    }

    public void useAttack(String PokemonName) {
        System.out.println(PokemonName + " used " + name);
    }
}


