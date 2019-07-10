package dmitrypimenov;

public class Automobile {
    protected int maxSpeed;
    protected String name;
    protected String color;
    protected double fuelVolume;

    public Automobile(int maxSpeed, String name, String color, double fuelVolume) {
    }

    public Automobile() {

    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setMaxSpeed(int s){
        this.maxSpeed = s;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String c){
        this.color = c;
    }

    public double getFuelVolume(){
        return fuelVolume;
    }
    public void setFuelVolume(double f){
        this.fuelVolume = f;
    }

    void automobile(){
        System.out.println("in a " + color + " " + name + " car with a " + fuelVolume + " tank at an average " + maxSpeed + " km/h went to Sochi ");
    }
}
