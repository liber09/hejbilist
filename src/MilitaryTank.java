//Military tank class extends vehicle
public class MilitaryTank extends Vehicle {
    //Constructor calls Vehicle constructor
    public MilitaryTank(){
        super("tank",25,2000,5);
        System.out.println("Tank created "+milesLeft+" miles to go!");
    }

}
