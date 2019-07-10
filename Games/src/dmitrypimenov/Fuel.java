package dmitrypimenov;

import java.util.Scanner;

public class Fuel {
    public static void execute(){
        final double c = 100;
        double d, d1, d2;
        char Rub;
        final double A92_100_km = 42.45;
        final double A95_100_km = 46.38;
        final double A98_100_km = 53.39;
        System.out.println("Input distance: ");
        Scanner a = new Scanner(System.in);
        d = (a.nextDouble()/c)* A92_100_km;
        d1 = (a.nextDouble()/c)* A95_100_km;
        d2 = (a.nextDouble()/c)* A98_100_km;
        System.out.println("A92: " + d + " Rub. ");
        System.out.println("A95: " + d1 + " Rub. ");
        System.out.println("A98: " + d2 + " Rub. ");
    }
}
