package org.java26.week7.monday.ex2G;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //Skriv en metod som letar upp en Car i team på namn (skiftlägesokänsligt). Träffen kan saknas, så
        //returtypen ska vara ärlig med det — alltså inte null som tyst kan smälla senare, utan en typ som tvingar
        //anroparen att ta ställning till tomma fallet.
        //Skriv ut antingen den hittade Car HP eller ett meddelande om att den inte finns.


        Car ferrari = new Car("Ferrari", 300);
        Car porsche = new Car("Porsche", 290);

        List<Car> dealership = new ArrayList<>();
        dealership.add(ferrari);
        dealership.add(porsche);

        Optional<Car> result = findByName(dealership, "fiat");

        result.ifPresentOrElse(
                car -> System.out.println("HP : " + car.getHp()),
                        () -> System.out.println("Car")
        );

        //När ingen Bil matchar namnet ska programmet varken krascha eller
        //skriva ett felmeddelande — det ska i stället falla tillbaka på en standard-Bil (t.ex. Maggiolino med 200 HP)
        //och fortsätta. Skriv ut namnet på den Bil du fick tillbaka, oavsett om den hittades eller är reserven.

        Car notFound = result.orElse(new Car("Maggiolino", 200));
        System.out.println(notFound.getName());
        System.out.println("HP: " + notFound.getHp());


        //result.orElseThrow(() -> new IllegalArgumentException("unknown"));
    }

    public static Optional<Car> findByName(List<Car> dealership, String name) {
        return dealership.stream()
                .filter(c -> c.getName().equalsIgnoreCase(name))
                .findFirst();

    }
}

