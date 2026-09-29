package org.java26.week5.g3;

public class Main {
    public static void main(String[] args) {
        // Skapa två Person-objekt med olika värden ur samma klass.
        // Skriv ut båda. Ändra sedan ett fält på det ena
        //objektet och skriv ut båda igen — det andra objektet ska vara oförändrat.


        Person p1 = new Person();
        p1.setName("Carmelo");
        p1.setAge(41);
        p1.setType(Type.STUDENT);

        Person p2 = new Person();
        p2.setName("Angelica");
        p2.setAge(36);
        p2.setType(Type.WORKER);

        System.out.println(p1);
        System.out.println(p2);

        p2.setAge(37);

        System.out.println(p1);
        System.out.println(p2);
    }
}
