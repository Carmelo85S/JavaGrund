package week3;

import java.util.ArrayList;

public class ShoppingListArraList {
    public static void main(String[] args) {
        //Skapa en ArrayList<String>. Lägg till fem varor.
        // Skriv ut hur många varor listan innehåller och alla
        //varor. Ta sedan bort den tredje varan och skriv ut listan igen.

        ArrayList<String> varor= new ArrayList<>();

        varor.add("Bread");
        varor.add("Cheese");
        varor.add("Water");
        varor.add("Kitchen paper");
        varor.add("Yoghurt");

        System.out.println("Array list size: "+ varor.size());
        System.out.println("----------------");
        System.out.println("List contains: ");
        for(String inList : varor){
            System.out.println(inList);
        }
        System.out.println("----------------");
        System.out.println("Remove an item: ");
        varor.remove(2);
        for(String inList : varor){
            System.out.println(inList);
        }


    }
}
