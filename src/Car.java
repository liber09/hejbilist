//Car class extends vehicle
public class Car extends Vehicle {

    //Constructor calls Vehicle constructor
    public Car(){
        super("car",18,100,10);
        System.out.println("Car created. "+milesLeft+" miles to go!");
    }


}
