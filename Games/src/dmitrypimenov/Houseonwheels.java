package dmitrypimenov;

public class Houseonwheels extends Automobile{
    int trailer;

    public Houseonwheels(int maxSpeed, String name, String color, double fuelVolume, int trailer){
        super (maxSpeed, name, color, fuelVolume);
        this.trailer = trailer;
    }

    void houseonwheels(){
        System.out.println("with a " + trailer + " kg trailer");
    }
}
