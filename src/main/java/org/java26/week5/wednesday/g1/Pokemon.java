package org.java26.week5.wednesday.g1;

public class Pokemon {
    private String name;
    private int maxHp;
    private int currentHp;
    private Type type;

    public Pokemon(String name, int maxHp, Type type) {
        this.name = name;
        this.maxHp = maxHp;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp() {
        this.maxHp = maxHp;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }
}
