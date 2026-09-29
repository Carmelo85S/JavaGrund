package org.java26.week5.g6;
public class Pokemon {

    private String name;
    private Type type;
    private int currentHp;
    private int maxHp;

    public Pokemon(String name, int maxHp, Type type) {
        this.name = name;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.type = type;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public int getMaxHp() {
        return maxHp;
    }
}
