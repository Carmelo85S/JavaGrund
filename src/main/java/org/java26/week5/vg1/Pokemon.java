package org.java26.week5.vg1;

public class Pokemon {
    private String name;
    private Type type;
    private int maxHP;
    private int currentHP;

    public Pokemon(String name, Type type, int maxHp) {
        setName(name);
        setType(type);
        setMaxHP(maxHp);
        this.currentHP = maxHP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                    "Name cant be empty"
            );
        }
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        if (type == null) {
            throw new IllegalArgumentException(
                    "Type cant be empty"
            );
        }
        this.type = type;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        if (maxHP <= 0) {
            throw new IllegalArgumentException(
                    "Max Hp can not be less or equal zero"
            );
        }
        this.maxHP = maxHP;
    }

    public void setCurrentHP(int currentHP) {
        if (currentHP < 0 || currentHP > maxHP) {
            throw new IllegalArgumentException(
                    "Current HP must be between 0 and max HP"
            );
        }

        this.currentHP = currentHP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    @Override
    public String toString() {
        return name + " (" + type + ", "
                + currentHP + "/" + maxHP + " HP)";
    }

}
