package org.java26.week6.monday.ArvPolymorfismInterfaces;

import java.util.ArrayList;
import java.util.List;

public class LiveCode {
    public static void main(String[] args) {
        //Animal dog = new Animal("Dog", 4);
        Animal animal1 = new Dog("dog", 4, new WalkMove(), true);

        Animal animal2 = new Cat("Cat", 4, new WalkMove(), "Chinese");

        Animal animal3 = new Horse("Horse", 4, new WalkMove(), false);

        List<Animal> zooStore = new ArrayList<>();

        zooStore.add(animal1);
        zooStore.add(animal2);
        zooStore.add(animal3);

        for (Animal a : zooStore) {
            a.makeSound();
            a.eatFood();

            if (a instanceof Cat cat) {
                System.out.println("it is a cat");
            }
            a.performMove();
        }

        for (Animal a : zooStore) {
            if (a instanceof Pettable p) {
                p.getPetted();
            }
            ;
        }

        Pettable p1 = new Cat("Nisse", 3, new WalkMove(), "Siames");

        visitorPetsAnimal(p1);


        Animal cat = new Cat("Pinky", 4, new WalkMove(), "Siames");
        cat.performMove();
        System.out.println("----");



        cat.performMove();
        System.out.println("Cat is scared and  fly away");
        cat.setMoveStrategy(new FlyMove());
        cat.performMove();
        System.out.println("----");

    }

    public static void visitorPetsAnimal(Pettable animal) {
        animal.getPetted();
    }

}
