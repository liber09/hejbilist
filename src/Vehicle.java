public class Vehicle {
    String vehicletype;
    int milesLeft;
    int ageToDrive;
    Driver driver;
    int distanceToDrive;
    public Vehicle(String vehicletype,int ageToDrive, int milesLeft,int distanceToDrive){
        this.vehicletype = vehicletype;
        this.ageToDrive = ageToDrive;
        this.milesLeft = milesLeft;
        this.distanceToDrive = distanceToDrive;
    }
    public void setDriver(Driver driver){
        if(driver.age >= this.ageToDrive){
            this.driver = driver;
            System.out.println("Driver changed to "+driver.name+".");
        }
        else{
            System.out.println("Driver not changed! "+driver.name+" is "+driver.age+", but must be "+ageToDrive+" or older to drive "+vehicletype);
        }
    }
    public Driver getDriver(){
        return this.driver;
    }
    public void drive(){
        if(getDriver() != null){
            if(milesLeft >= distanceToDrive){
                milesLeft = milesLeft - distanceToDrive;
                System.out.println(vehicletype+" drove "+distanceToDrive+" miles - "+milesLeft+" miles to go");
            }
        }
        else{
            System.out.println(vehicletype+" didn't drive - there's no driver!");
        }

    }
}
