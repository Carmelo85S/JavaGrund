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
        this.currentHp = maxHp;
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

    public int getMaxHp() {

        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        if(maxHp <= 0){
            maxHp = 0;
        }
        if(maxHp > 35){
            maxHp = 35;
        }
        this.maxHp = maxHp;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public void setCurrentHp(int currentHp) {
        if (currentHp < 0) {
            currentHp = 0;
        }

        if (currentHp > maxHp) {
            currentHp = maxHp;
        }

        this.currentHp = currentHp;
    }
}
