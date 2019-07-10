package dmitrypimenov;

public class Point {
    private int x = 0;
    private int y = 0;

    public int getX() { return x; }
    public void setX(int value) { x = value; }

    public int getY() { return y; }
    public void setY(int value) { y = value; }

    public int getRadiusVector() {
        return (int) Math.sqrt(x * x + y * y);
    }

    public int getDistanceTo(Point other) {
        return (int) Math.sqrt((x - other.getX()) * (x - other.getX())
                + (y - other.getY()) * (y - other.getY()));
    }

    public void printMe() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "{ " + x + " ; " + y + " }";
    }
}
