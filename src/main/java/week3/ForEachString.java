package week3;

public class ForEachString {
    public static void main(String[] args) {
        //Lagra veckans sju dagar i en String[]. Skriv ut varje dag på egen rad.
        String[] veckorDag = new String[7];
        veckorDag[0] = "Monday";
        veckorDag[1] = "Tuesday";
        veckorDag[2] = "Wednesday";
        veckorDag[3] = "Thursday";
        veckorDag[4] = "Friday";
        veckorDag[5] = "Saturday";
        veckorDag[6] = "Sunday";
        for(String dagar : veckorDag){
            System.out.println(dagar);
        }
    }
}
