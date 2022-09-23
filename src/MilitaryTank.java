//Military tank class implements vehicle
public class MilitaryTank implements Vehicle {
    private int milesLeft = 2000; //How far can we drive?
    private int ageToDrive = 25; //How old must the driver be?
    private Driver driver; // the driver object
    private int distanceToDrive = 5; //How far we go each time we drive
    private String type = "tank"; //tells what type we are

    public MilitaryTank(){
        System.out.println("Tank created "+milesLeft+" miles to go!");
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
        If the tank has a driver, the tank drives
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
