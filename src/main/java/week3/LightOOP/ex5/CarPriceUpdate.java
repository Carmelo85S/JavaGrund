package week3.LightOOP.ex5;

public class CarPriceUpdate {
    public static void main(String[] args) {
        //Create the engine and the car using their constructors
        //Print the original price.
        //Calculate the discount and assign the new value directly to `demoCar.price`.
        //Print the discounted price.

        Engine e = new Engine("Ferrari v8", 380, FuelType.PETROL);
        Car demoCar = new Car("Ferrari", 1978, 200000, e.fuelType);

        System.out.println("Original price: "+ demoCar.originalPrice);

        int discount = 30000;
        if(demoCar.originalPrice > 40000){
            demoCar.originalPrice = demoCar.originalPrice - discount;
        }
        System.out.println("After discount price: "+ demoCar.originalPrice);

    }
}
