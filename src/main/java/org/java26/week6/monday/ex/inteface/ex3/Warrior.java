package org.java26.week6.monday.ex.inteface.ex3;

public class Warrior implements Attackable{
    String name;
    int damageValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Warrior(String name, int damageValue){
        this.name = name;
        this.damageValue = damageValue;
    }

    public int getDamageValue() {
        return damageValue;
    }

    public void setDamageValue(int damageValue) {
        this.damageValue = damageValue;
    }

    @Override
    public void attackable() {
        System.out.println(name + " has damage value of: " + damageValue);
    }
}
