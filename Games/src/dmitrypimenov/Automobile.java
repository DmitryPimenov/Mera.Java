package dmitrypimenov;

public class Automobile {

    public int maxSpeed;
    public String name;
    public String color;
    public double fuelVolume;

    public void AverageSpeed(int value){
        maxSpeed += value;
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
