package dmitrypimenov;

public class TimePoint {
    private int t;

    public int getT() { return t; }
    public void setT(int value) { t = value; }

    public int getTime() {
        return (int) t /*= S/maxSpeed*/;
    }

    public void printMe() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "{ " + t + " }";
    }
}
