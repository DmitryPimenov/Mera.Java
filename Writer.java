import java.util.Scanner;

interface writer {
    void write();
}
class pen implements writer {
    public void write() {
        System.out.println("Ручка");
    }
}
class pencil implements writer {
    public  void write() {
        System.out.println("Карандаш");
    }
}
class marker implements writer {
    public  void write() {
        System.out.println("Маркер");
    }
}
class kit {
    public void doSomething(writer k){
        k.write();
    }
}
public class Writer {
    public static void main(String[] args){
        kit k = new kit();
        writer p = new pen ();
        writer pc = new pencil ();
        writer m = new marker ();
        Scanner a = new Scanner(System.in);
        System.out.println("Чем вы будете писать?");
        System.out.println("1. Ручка");
        System.out.println("2. Карандаш");
        System.out.println("3. Маркер");
        //System.out.println(a.nextInt());
        switch (a.nextInt()) {
            case 1:
                    k.doSomething(p);
                    break;
            case 2:
                    k.doSomething(pc);
                    break;
            case 3:
                    k.doSomething(m);
                    break;
            }
    }
}