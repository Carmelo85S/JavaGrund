package org.java26.week6.monday.ex.g2;

public class Main {
    public static void main(String[] args) {
        //Skapa DamageAttack som ärver Attack med extends och lägger till ett eget fält power (int, måste vara större
        //än 0). Konstruktorn ska först låta basklassen sätta upp sina fält via super(...) och sedan sätta sitt egna fält.
        //Visa att din DamageAttack redan har basklassens namn-getter — utan att du skriver den en gång till.
        Attack attack = new DamageAttack("DamageAttack", 10, 20);
        attack.useAttack("Pikachu");

        //Behåll valideringen i Attack (accuracy 0–100) och lägg en egen i DamageAttack (power > 0). Var och en
        //validerar sitt egna fält.
        //Försök skapa ett giltigt objekt, ett med ogiltig accuracy och ett med ogiltig power. Programmet ska ge ett tydligt
        //felmeddelande och fortsätta — inte krascha.
        try {
            Attack accuracy = new DamageAttack("Accuracy!", 120, 43);
            accuracy.useAttack("Bulbasaur");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            Attack power = new DamageAttack("Power!", 90, 243);
            power.useAttack("Charizardo");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
