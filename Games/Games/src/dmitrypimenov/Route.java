package dmitrypimenov;

public class Route {
protected String home;
protected String city;
protected double distance;
final double afuel =9; // Средний расход топлива на 100 км.
    Route(String h, String c, double dis){
        this.home = h;
        this.city = c;
        this.distance = dis;
    }

    public String getHome(){
        return home;
    }
    public void setHome(String h){
        this.home= h;
    }

    public String getCity(){
        return city;
    }
    public void setCity(String c){
        this.city= c;
    }

    public double getDistance(){
        return distance;
    }
    public void setDistance(double dis){
        this.distance = 0;
    }

    public Route() {

    }

    public double route(){
        final double c = 100;
        double d, d1, d2;
        final double A92_100_km = 42.45;
        final double A95_100_km = 46.38;
        final double A98_100_km = 53.39;
        //d = (getDistance()/c)* A92_100_km;
        d1 = ((getDistance()/c)* A95_100_km)*distancefuel();
        //d2 = (getDistance()/c)* A98_100_km;
        //System.out.println("A92: " + d + " Rub. ");
        System.out.print("Сумма денег необходимая на бензин - ");
        System.out.println("A95: " + d1 + " руб. ");
        //System.out.println("A98: " + d2 + " Rub. ");
        return d1;
    }

    public double fuel() {
        final double c = 100;
        double f;
        final double l = 60;
        distance = getDistance();
        f = ((distance/c)* l)/afuel;
        System.out.println("Расход топлива = " + f + " литров. ");
        return  f;
    }

    public double fuel1() {
        final double c = 100;
        double f;
        final double l = 60;
        distance = getDistance();
        f = ((distance/c)* l)/afuel;
        System.out.println("Расход топлива = " + f + " литров. ");
        return  f;
    }

    public double fuel2() {
        final double c = 100;
        double f;
        final double l = 60;
        distance = getDistance();
        f = ((distance/c)* l)/afuel;
        System.out.println("Расход топлива = " + f + " литров. ");
        return  f;
    }

    public double averagefuel() {
        final double c = 100;
        double af;
        final double l = 60;
        distance = 850; // Сколько км можно проехать на 1 заправку до полного бака.
        af = l/distance*c;
        System.out.println("Средний расход топлива = " + af + " литров/100 км");
        return af;
    }

    public double averagefuel1() {
        final double c = 100;
        double af;
        final double l = 60;
        distance = 900;
        af = l/distance*c;
        System.out.println("Средний расход топлива = " + af + " литров/100 км");
        return af;
    }

    public double averagefuel2() {
        final double c = 100;
        double af;
        final double l = 60;
        distance = 750;
        af = l/distance*c;
        System.out.println("Средний расход топлива = " + af + " литров/100 км");
        return af;
    }

    public int distancefuel() {
        final int k = 60;
        int df = (int)fuel()/k;
        System.out.println("Количество заправок = " + df );
        return df;
    }

    public int distancefuel1() {
        final int k = 60;
        int df = (int)fuel1()/k;
        System.out.println("Количество заправок = " + df );
        return df;
    }

    public int distancefuel2() {
        final int k = 60;
        int df = (int)fuel2()/k;
        System.out.println("Количество заправок = " + df );
        return df;
    }
}
