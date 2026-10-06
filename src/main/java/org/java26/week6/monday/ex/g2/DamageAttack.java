package org.java26.week6.monday.ex.g2;

public class DamageAttack extends Attack {
    private final int power;

    public DamageAttack(String name, int accuracy, int power) {
        super(name, accuracy);
        if(power <= 0){
            throw new IllegalArgumentException(
                    "Power > 0"
            );
        }
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
