public class Automobile {
    private int maxSpeed;
    private String name;
    private String color;
    private double fuelVolume;

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
}
