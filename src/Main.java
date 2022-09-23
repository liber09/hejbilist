public class Main {
    public static void main(String[] args) {
        //Create two drivers, one car and one MilitaryTank.
        Driver d1 = new Driver("Emilia",17);
        Driver d2 = new Driver("Niklas",21);
        Vehicle v1 = new Car();
        Vehicle v2 = new MilitaryTank();

        //Try to drive the vehicles
        v1.drive();
        v2.drive();

        //Set new drivers
        v1.setDriver(d1);
        v1.setDriver(d2);
        v2.setDriver(d2);
        v2.setDriver(new Driver("TankMan",300));

        //Try to drive the vehicles
        v1.drive();
        v2.drive();
    }
}