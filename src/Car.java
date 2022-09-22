public class Car extends Vehicle {
    int milesLeft = 100;
    public Car(){
        super("Car");
        System.out.println("Car created. "+milesLeft+" miles to go!");
    }


}
