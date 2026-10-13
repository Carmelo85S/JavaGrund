package org.java26.week7.monday.ex2G;

public class Car {
    String name;
    int hp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Car(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
}
