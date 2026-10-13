package org.java26.week7.monday.ex1G;

public class Warrior {
    private String name;
    private int maxHp;
    private int currentHp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public Warrior(String name, int maxHp){
        setName(name);
        setMaxHp(maxHp);
        this.currentHp = maxHp;
    }
}
