package org.java26.week6.monday.ex.g2;

public class Main {
    public static void main(String[] args) {
        //Skapa DamageAttack som ärver Attack med extends och lägger till ett eget fält power (int, måste vara större
        //än 0). Konstruktorn ska först låta basklassen sätta upp sina fält via super(...) och sedan sätta sitt egna fält.
        //Visa att din DamageAttack redan har basklassens namn-getter — utan att du skriver den en gång till.
        try{
            Attack attack = new DamageAttack("DamageAttack", 140, 20);
            attack.useAttack("Pikachu");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    }
}
