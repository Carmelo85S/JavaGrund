package org.java26.week6.monday.ex.g2;

public class DamageAttack extends Attack {
    private final int power;

    public DamageAttack(String name, int accuracy, int power) {
        super(name, accuracy);
        if(power <= 0 || power > 100){
            throw new IllegalArgumentException(
                    "Power not in intervall"
            );
        }
        this.power = power;
    }

    public int useAttack() {
        return power;
    }
}
