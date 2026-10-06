package org.java26.week6.monday.ex.g1;

public class Main {
    public static void main(String[] args) {
        //Skapa en klass Attack med två private final-fält: ett namn (String) och en träffsäkerhet accuracy (int,
        //mellan 0 och 100). Konstruktorn validerar att accuracy ligger i intervallet. Lägg till en getter för namnet och en
        //metod som skriver en logg-rad när attacken används.
        //Skapa ett objekt och anropa metoden.
        //Körningsexempel:
        //Pikachu använder Thunderbolt!

        Attack attack = new Attack("Thunderbolt", 50);
        attack.useAttack("Pikachu");
    }
}
