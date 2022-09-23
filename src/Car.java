//Car class implements vehicle
public class Car implements Vehicle {
    private int milesLeft = 100; //How far can we drive?
    private int ageToDrive = 18; //How old must the driver be?
    private Driver driver; // the driver object
    private int distanceToDrive = 10; //How far we go each time we drive
    String type = "car"; //tells what type we are

    public Car(){
        System.out.println("Car created. "+milesLeft+" miles to go!");
    }
    public void setDriver(Driver driver){
        if(driver.age >= this.ageToDrive){
            this.driver = driver;
            System.out.println("Driver changed to "+driver.name+".");
        }
        else{
            System.out.println("Driver not changed! "+driver.name+" is "+driver.age+", but must be "+ageToDrive+" or older to drive "+ type);
        }
    }
    public Driver getDriver(){
        return this.driver;
    }
    /*
        If the car has a driver, the car drives
        If no driver, prints "didn't drive"
     */
    public void drive(){
        if(getDriver() != null){
            if(milesLeft >= distanceToDrive){
                milesLeft = milesLeft - distanceToDrive;
                System.out.println(type +" drove "+distanceToDrive+" miles - "+milesLeft+" miles to go");
            }
        }
        else{
            System.out.println(type +" didn't drive - there's no driver!");
        }
    }
}
