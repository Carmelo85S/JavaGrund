package org.java26.week5.g5;

public class Pokemon {
    private String name;
    private int maxHp;
    private int currentHp;
    private Type type;

    public Pokemon() {
    }

    ;

    public Pokemon(String name, int maxHp, Type type) {
        setName(name);
        setMaxHp(maxHp);
        this.currentHp = maxHp;
        setType(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null && name.isBlank()) {
            throw new IllegalArgumentException(
                    "Blank input name not allowed."
            );
        } else if (name.isEmpty()) {
            throw new IllegalArgumentException(
                    "Empty name not allowed."
            );
        } else
            System.out.println("Pokemon created. ");

        this.name = name;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        if (maxHp <= 0) {
            throw new IllegalArgumentException(
                    "Max hp needs to be a positive number"
            );
        }
        this.maxHp = maxHp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        if (type == null) {
            throw new IllegalArgumentException(
                    "type can't be null"
            );
        }
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pokemon name: " + getName() + " - " + "( " + getMaxHp() + " / " + getCurrentHp() + " )";
    }
}
