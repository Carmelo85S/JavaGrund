package org.java26.week6.monday.ArvPolymorfism;

import java.util.ArrayList;
import java.util.List;

public class LiveCode {
    public static void main(String[] args) {
        //Animal dog = new Animal("Dog", 4);
        Animal animal1 = new Dog("dog", 4, true);

        Animal animal2 = new Cat("Cat", 4, "Chinese");

        Animal animal3 = new Horse("Horse", 4, false);

        List<Animal> zooStore = new ArrayList<>();

        zooStore.add(animal1);
        zooStore.add(animal2);
        zooStore.add(animal3);

        for(Animal a : zooStore){
            a.makeSound();
            a.eatFood();

            if(a instanceof Cat cat){
                System.out.println("it is a cat");
            }
        }
    }
}
