package dmitrypimenov;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
enum Character{
    SIDOROV,
    PETROV,
    IVANOV
}
    public static void main(String[] args) {
        int x = 0;
        Family s;
        s = new Family("Sidorov");
        s.setAmount(4);
        s.setCity("Novosibirsk");
        System.out.print(++x + ". ");
        s.members();

        Automobile auto1 = new Automobile();
        auto1.setName("BMW");
        auto1.setColor("Red");
        auto1.setMaxSpeed(100);
        auto1.setFuelVolume(60.0);
        auto1.automobile();

        Houseonwheels trail = new Houseonwheels(auto1.getMaxSpeed(), auto1.getName(), auto1.getColor(), auto1.getFuelVolume(), 900);
        trail.houseonwheels();

        Family p;
        p = new Family("Petrov");
        p.setAmount(3);
        p.setCity("Murmansk");
        System.out.print(++x + ". ");
        p.members();

        Automobile auto2 = new Automobile();
        auto2.setName("VW");
        auto2.setColor("Black");
        auto2.setMaxSpeed(110);
        auto2.setFuelVolume(40.0);
        auto2.automobile();

        Family i;
        i = new Family("Ivanov");
        i.setAmount(5);
        i.setCity("Vladivostok");
        System.out.print(++x + ". ");
        i.members();

        Automobile auto3 = new Automobile();
        auto3.setName("AUDI");
        auto3.setColor("White");
        auto3.setMaxSpeed(90);
        auto3.setFuelVolume(50.0);
        auto3.automobile();

        Houseonwheels trail1 = new Houseonwheels(auto3.getMaxSpeed(), auto3.getName(), auto3.getColor(), auto3.getFuelVolume(), 400);
        trail1.houseonwheels();

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

        System.out.println("Hello! Choose a family!");
        ArrayList<String> family = new ArrayList<String>();
        family.add("1. Sidorov");
        family.add("2. Petrov");
        family.add("3. Ivanov");
        System.out.println(family);
        Scanner a = new Scanner(System.in);
        switch (a.nextInt()){
            case 1:
                System.out.println("Hello from Sidorovs! We are ready to travel!");
                break;
            case 2:
                System.out.println("Hello from Petrovs! We are ready to travel!");
                break;
            case 3:
                System.out.println("Hello from Ivanovs! We are ready to travel!");
                break;
        }
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

        Distance.execute();

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

        Times.execute();

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

        Fuel.execute();
    }
}
