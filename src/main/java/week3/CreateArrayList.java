package week3;

import java.util.ArrayList;

public class CreateArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Luca");
        names.add("Marco");
        names.add("Sarah");

        for(String name : names){
            System.out.println(name);
        }
        //Numbers of element
        System.out.println("Number of element: "+names.size());

        //Marco -> David
        names.set(2, "David");
        System.out.println("Marco is gone, welcome to: "+ names.get(2));

    }
}
