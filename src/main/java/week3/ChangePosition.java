package week3;

import java.util.ArrayList;

public class ChangePosition {
    public static void main(String[] args) {
        // Byt ut varan på plats två mot en annan vara.
        // Skriv ut den första varan i listan.

        ArrayList<String> varor = new ArrayList<>();

        varor.add("Bread");
        varor.add("Cheese");
        varor.add("Water");
        varor.add("Kitchen paper");
        varor.add("Yoghurt");

        for(String item : varor){
            System.out.println(item);
        }

        System.out.println("--------------");
        System.out.println("Change position:");
        varor.set(2, "Milk");
        System.out.println("First element in the list: "+ varor.get(0));
        System.out.println("--------------");
        for(String item : varor){
            System.out.println(item);
        }


    }
}

