package dmitrypimenov;

public class Automobile {

    public int averageSpeed;
    public String name;
    public String color;
    public double averagefuelСonsumption;

    public Automobile() {

    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(int s) {
        this.averageSpeed = s;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public double getAveragefuelСonsumption() {
        return averagefuelСonsumption;
    }

    public void setAveragefuelСonsumption(double f) {
        this.averagefuelСonsumption = f;
    }

    void automobile() {
        System.out.println(" на " + getColor() + " " + getName()  +  " отправились в Сочи ");
    }
}
