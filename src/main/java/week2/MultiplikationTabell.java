package week2;

public class MultiplikationTabell {
    public static void main(String[] args) {
        //Skriv ut multiplikationstabellen 1 - 5
        for (int row = 1; row <= 5; row++){
            for (int col = 0; col <= 10; col++){
                System.out.print(row * col +"\t");
            }
            System.out.println();
        }
    }
}
