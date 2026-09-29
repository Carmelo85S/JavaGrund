package org.java26.week5.vg2;

public class Pokemon {
    private String name;
    private Type type;

    public Pokemon(){};
    public Pokemon(String name, Type type) {
        setName(name);
        setType(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cant be empty");
        }
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        if (type == null) {
            throw new IllegalArgumentException("Type cant be empty");
        }
        this.type = type;
    }

    @Override
    public String toString(){
        return name + " is type " + type;
    }
}

