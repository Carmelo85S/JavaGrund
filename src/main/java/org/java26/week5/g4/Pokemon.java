package org.java26.week5.g4;

public class Pokemon {
    private String name;
    private Type type;
    private int maxHp;
    private int currentHp;

    public Pokemon(String name, Type type, int maxHp){
        setName(name);
        setType(type);
        setMaxHp(maxHp);
        this.currentHp = maxHp;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException(
                    "Name can not be empty"
            );
        }
        this.name = name;
    }

    public Type getType() {

        return type;
    }

    public void setType(Type type) {
        if(type == null){
            throw new IllegalArgumentException(
                    "Type can not be null"
            );
        }
        this.type = type;
    }

    public int getMaxHp() {

        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        if(maxHp <= 0){
            throw new IllegalArgumentException(
                    "Max hp needs to be a positive number"
            );
        }
        this.maxHp = maxHp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    @Override
    public String toString(){
        return getName() + " created: " + currentHp + " / " + maxHp;
    }
}
