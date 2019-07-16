package dmitrypimenov;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    enum Character {
        SIDOROV,
        PETROV,
        IVANOV
    }

    public static void main(String[] args) throws Exception {

            /*Class automobileType = Class.forName("Vehicle.Car");
            Object automobile = automobileType.newInstance();

            Class[] paramTypes = new Class[]{
                    int.class
            };
            Object[] args = new Object[]{
                    new Integer(100)
            };
            Method method = automobileType.getMethod("AverageSpeed", paramTypes);
            method.invoke(automobile, args);
            Field field = automobileType.getField("maxSpeed");
            int maxSpeed = field.getInt(automobile);*/

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
            auto1.setMaxSpeed(300);
            auto1.setFuelVolume(60.0);
            auto1.automobile();

            Family p;
            p = new Family("Petrov");
            p.setAmount(3);
            p.setCity("Murmansk");
            System.out.print(++x + ". ");
            p.members();

            Automobile auto2 = new Automobile();
            auto2.setName("VW");
            auto2.setColor("Black");
            auto2.setMaxSpeed(300);
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
            auto3.setMaxSpeed(300);
            auto3.setFuelVolume(50.0);
            auto3.automobile();

            System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

            System.out.println("Hello! Choose a family!");
            ArrayList<String> family = new ArrayList<String>();
            family.add("1. Sidorov");
            family.add("2. Petrov");
            family.add("3. Ivanov");
            System.out.println(family);
            Scanner a = new Scanner(System.in);
            switch (a.nextInt()) {
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


            System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

            Fuel.execute();
    }
}
