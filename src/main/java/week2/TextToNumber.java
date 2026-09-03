package week2;

public class TextToNumber {
    public static void main(String[] args) {
        //Skriv ett program som försöker tolka en textsträng som ett heltal. Om strängen inte är ett giltigt tal får
        //programmet inte krascha — det ska skriva ett begripligt meddelande istället. Testa med både en giltig sträng och
        //ren skräp.
        String text = "abc";
        convertTextToNum(text);

    }
    public static void convertTextToNum(String text){
        try{
            int conversion = Integer.parseInt(text);
            System.out.println("Text after conversion: "+ conversion);
        } catch (NumberFormatException e) {
            System.out.println("Can not convert "+ text + " as integer.");
        }
    }
}
