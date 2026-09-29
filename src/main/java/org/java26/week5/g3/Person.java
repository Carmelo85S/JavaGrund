package org.java26.week5.g3;

public class Person {
    private String name;
    private int age;
    private Type type;

    public Person() {
    }

    ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.length() <= 2) {
            throw new IllegalArgumentException(
                    "Name should have at least 3 char"
            );
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException(
                    "Insert a valid number");
        }
        this.age = age;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        if(type == null){
            throw new IllegalArgumentException(
                    "type can't be null"
            );
        }
        this.type = type;
    }

    @Override
    public String toString(){
        return getName() + " is " + getAge() + " years old, and is " + getType();
    }
}
