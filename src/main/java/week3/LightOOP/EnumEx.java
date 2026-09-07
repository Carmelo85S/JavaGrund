package week3.LightOOP;

public class EnumEx {
    public static void main(String[] args) {
        FuelType engine = FuelType.DIESEL;

        switch(engine){
            case DIESEL -> System.out.println("Your engine is: " + FuelType.DIESEL);
            case ELECTRIC -> System.out.println("Your engine is: " + FuelType.ELECTRIC);
            case HYBRID -> System.out.println("Your engine is: " + FuelType.HYBRID);
            case PETROL -> System.out.println("Your engine is: " + FuelType.PETROL);
            default -> System.out.println("Maybe a bicycle?");
        }
    }
}
