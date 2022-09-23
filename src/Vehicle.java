public class Vehicle {
    String vechicleType; //What type of vehicle is it?
    int milesLeft; //How far can we drive?
    int ageToDrive; //How old must the driver be?
    Driver driver; // the driver object
    int distanceToDrive; //How far we go each time we drive
    /*
        Creates the vehicle type.
        Inits every instance variable except Driver
    */
    public Vehicle(String vehicleType, int ageToDrive, int milesLeft, int distanceToDrive){
        this.vechicleType = vehicleType;
        this.ageToDrive = ageToDrive;
        this.milesLeft = milesLeft;
        this.distanceToDrive = distanceToDrive;
    }
    //Sets the driver if the new drivers age
    //meets the requirement of the vehicle type
    public void setDriver(Driver driver){
        if(driver.age >= this.ageToDrive){
            this.driver = driver;
            System.out.println("Driver changed to "+driver.name+".");
        }
        else{
            System.out.println("Driver not changed! "+driver.name+" is "+driver.age+", but must be "+ageToDrive+" or older to drive "+ vechicleType);
        }
    }
    //Returns the driver
    public Driver getDriver(){
        return this.driver;
    }
    /*
        If the vehicle has a driver, the vehicle drives
        If no driver, prints "didn't drive"
     */
    public void drive(){
        if(getDriver() != null){
            if(milesLeft >= distanceToDrive){
                milesLeft = milesLeft - distanceToDrive;
                System.out.println(vechicleType +" drove "+distanceToDrive+" miles - "+milesLeft+" miles to go");
            }
        }
        else{
            System.out.println(vechicleType +" didn't drive - there's no driver!");
        }

    }
}
