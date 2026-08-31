package week2;

public class StarStairs {
    public static void main(String[] args) {
        //Läs in ett heltal som anger en höjd och rita en trappa av asterisker (*)
        // där rad 1 har en asterisk, rad 2 har två, och
        //så vidare ner till den sista raden. Du behöver en loop inuti en loop.

        for(int i = 0; i < 10; i++){
            for(int j = 1; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
