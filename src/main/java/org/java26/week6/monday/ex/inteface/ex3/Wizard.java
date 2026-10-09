package org.java26.week6.monday.ex.inteface.ex3;

public class Wizard implements Attackable {
    String name;
    boolean hasHat;
    int damageValue;

    public Wizard(String name, boolean hasHat, int damageValue){
        this.name = name;
        this.hasHat = hasHat;
        this.damageValue = damageValue;
    }

    @Override
    public void attackable() {
        System.out.println(name + " has damage value of " + damageValue);
    }
}
