package week3;

import java.util.HashSet;

public class CreateHashSet {
    public static void main(String[] args) {
        //create an HashSet string and add names
        HashSet<String> names = new HashSet<>();

        names.add("Anna");
        names.add("Anna");
        names.add("Marco");
        names.add("Lucio");

        System.out.println(names);

        //check i a name is present
        if(names.contains("Anna")){
            System.out.println("Already present");
        }


    }
}
