package org.java26.week6.monday.ex.inteface.ex3;

public class Archer implements Attackable {
    String name;
    int damageValue;

    public Archer(String name, int damageValue){
        this.name = name;
        this.damageValue = damageValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void attackable() {
        System.out.println(name + " has damage value of " + damageValue);
    }
}
