import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Project {
    public String auto;
    public String family;

    public Project(String auto, String family) {
        this.auto = auto;
        this.family = family;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null) return false;
        if (other.getClass() != this.getClass()) return false;
        Project that = (Project) other;

        return (this.auto.equals(that.auto)) && (this.family == that.family);
    }

    @Override
    public String toString() {
        return auto + " " + family;
    }

    @Override
    public int hashCode() {
        return Objects.hash(family, auto);
    }

    public static void main(String[] args) throws NullPointerException {
        try {

            System.out.println("Привет! Выбери героев и укажи куда и на чем они поедут.\n");

            Family s;
            s = new Family("Sidorovi");
            System.out.println(s.name);
            s.setAmount(3);
            System.out.println("Amount = " + s.getAmount() + " humans\n");

            System.out.println("Automobile " + s.name);
            Automobile auto1 = new Automobile();
            auto1.setName("BMW");
            System.out.println(auto1.getName());
            auto1.setColor("Red");
            System.out.println("Color - " + auto1.getColor());
            auto1.setMaxSpeed(300);
            System.out.println("Maximal speed - " + auto1.getMaxSpeed() + " km/h");
            auto1.setFuelVolume(60.0);
            System.out.println("Volume tank - " + auto1.getFuelVolume() + " liter\n");

            System.out.println("Times " + s.name);
            Times time1 = new Times();
            time1.setTime(180.0);
            System.out.println("Times - " + time1.getTime() + " min\n");

            Family i;
            i = new Family("Ivanovi");
            System.out.println(i.name);
            i.setAmount(5);
            System.out.println("Amount = " + i.getAmount() + " humans\n");

            System.out.println("Automobile " + i.name);
            Automobile auto2 = new Automobile();
            auto2.setName("AUDI");
            System.out.println(auto2.getName());
            auto2.setColor("White");
            System.out.println("Color - " + auto2.getColor());
            auto2.setMaxSpeed(350);
            System.out.println("Maximal speed - " + auto2.getMaxSpeed() + " km/h");
            auto2.setFuelVolume(55.0);
            System.out.println("Volume tank - " + auto2.getFuelVolume() + " liter\n");

            System.out.println("Times " + i.name);
            Times time2 = new Times();
            time2.setTime(120.0);
            System.out.println("Times - " + time2.getTime() + " min\n");

            Family k;
            k = new Family("Kuznecovi");
            System.out.println(k.name);
            k.setAmount(4);
            System.out.println("Amount = " + k.getAmount() + " humans\n");

            System.out.println("Automobile " + k.name);
            Automobile auto3 = new Automobile();
            auto3.setName("VW");
            System.out.println(auto3.getName());
            auto3.setColor("Black");
            System.out.println("Color - " + auto3.getColor());
            auto3.setMaxSpeed(250);
            System.out.println("Maximal speed - " + auto3.getMaxSpeed() + " km/h");
            auto3.setFuelVolume(65.0);
            System.out.println("Volume tank - " + auto3.getFuelVolume() + " liter\n");

            System.out.println("Times " + k.name);
            Times time3 = new Times();
            time3.setTime(220.0);
            System.out.println("Times - " + time3.getTime() + " min\n");

            Scanner input = new Scanner(System.in);
            HashMap<String, Project> p = new HashMap<>();
            Project a = new Project("", "Sidorovi");
            Project b = new Project("", "Ivanovi");
            Project c = new Project("", "Kuznecovi");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("a == a: " + a.equals(a));
            System.out.println("a == b: " + a.equals(b));
            System.out.println("a == c: " + a.equals(c));

            p.put(input.next(), a);
            p.put(input.next(), b);
            p.put(input.next(), c);
            System.out.println(p);
            System.out.println(p.get(input.next()));

        }catch(Exception e){
            System.out.println("Error");
        }
    }
}

