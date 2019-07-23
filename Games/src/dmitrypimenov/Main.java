package dmitrypimenov;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) throws Exception{
                try {
                        class Family {
                                public String name;
                                public String city;
                                public int amount;

                                Family(String n) {
                                        this.name = n;
                                }

                                public String getCity() {
                                        return city;
                                } //Возвращает значение города

                                public void setCity(String c) {
                                        this.city = c;
                                } //Устанавливает значение города

                                public int getAmount() {
                                        return amount;
                                }

                                public void setAmount(int a) {
                                        this.amount = a;
                                }
                                void members(){
                                        System.out.print("Семья " + name + " из города " + getCity() + " в составе " + getAmount() + " членов семьи ");
                                }
                        }

                        class Automobile {

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

                        class Route {
                                protected String home;
                                protected String city;
                                protected double distance;
                                final double afuel =9; // Средний расход топлива на 100 км.
                                Route(String h, String c, double dis){
                                        this.home = h;
                                        this.city = c;
                                        this.distance = dis;
                                } // Конструктор который вызывается при создании объекта и для его инициализации

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
                                        d1 = Math.ceil((getDistance()/c)* A95_100_km)*distancefuel();
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
                                        f = Math.ceil(((distance/c)* l)/afuel);
                                        System.out.println("Расход топлива = " + f + " литров. ");
                                        return  f;
                                }

                                public double fuel1() {
                                        final double c = 100;
                                        double f;
                                        final double l = 60;
                                        distance = getDistance();
                                        f = Math.ceil(((distance/c)* l)/afuel);
                                        System.out.println("Расход топлива = " + f + " литров. ");
                                        return  f;
                                }

                                public double fuel2() {
                                        final double c = 100;
                                        double f;
                                        final double l = 60;
                                        distance = getDistance();
                                        f = Math.ceil(((distance/c)* l)/afuel);
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

                        class Time {
                                double start;
                                double finish;

                                Time(double s, double f){
                                        this.start = s;
                                        this.finish = f;
                                }

                                public double getStart(){
                                        return start;
                                }
                                public void setStart(int s){
                                        this.start = s;
                                }

                                public double getFinish(){
                                        return finish;
                                }
                                public void setFinish(int f){
                                        this.finish= f;
                                }

                                public Time() {

                                }
                                public double time(){
                                        double t;
                                        t = finish-start;
                                        System.out.println("Потраченное время - " + t + " часов");
                                        return t;
                                }
                        }

                        int x = 0;
                        Family s;
                        s = new Family("Сидоровых");
                        s.setAmount(4);
                        s.setCity("Новосибирск");
                        System.out.print("\n" + ++x + ". ");
                        s.members();

                        Automobile auto1 = new Automobile();
                        auto1.setName("BMW");
                        auto1.setColor("Красной");
                        auto1.automobile();

                        Route r = new Route(s.getCity(), "Сочи", 4271.9);
                        Time t = new Time(4, 59);
                        System.out.println("От Новосибирска до Сочи " + r.distance + " км ");
                        System.out.println("Затраты на поездку: ");
                        double dis = r.route();
                        double tim = t.time();
                        double sp = Math.ceil(dis / tim);
                        System.out.println("Средняя скорость " + sp + " км/ч\n");

                        Family p;
                        p = new Family("Петровых");
                        p.setAmount(3);
                        p.setCity("Мурманск");
                        System.out.print(++x + ". ");
                        p.members();

                        Automobile auto2 = new Automobile();
                        auto2.setName("VW");
                        auto2.setColor("Черном");
                        auto2.automobile();

                        Route r1 = new Route(p.getCity(), "Сочи", 3566.5);
                        Time t1 = new Time(4, 45);
                        System.out.println("От Мурманска до Сочи " + r1.distance + " км ");
                        System.out.println("Затраты на поездку: ");
                        double dis1 = r1.route();
                        double tim1 = t1.time();
                        double sp1 = Math.ceil(dis1 / tim1);
                        System.out.println("Средняя скорость " + sp1 + " км/ч\n");

                        Family i;
                        i = new Family("Ивановых");
                        i.setAmount(5);
                        i.setCity("Владивосток");
                        System.out.print(++x + ". ");
                        i.members();

                        Automobile auto3 = new Automobile();
                        auto3.setName("AUDI");
                        auto3.setColor("Белом");
                        auto3.automobile();

                        Route r2 = new Route(i.getCity(), "Сочи", 10048.2);
                        Time t2 = new Time(4, 371);
                        System.out.println("От Владивостока до Сочи " + r2.distance + " км ");
                        System.out.println("Затраты на поездку: ");
                        double dis2 = r2.route();
                        double tim2 = t2.time();
                        double sp2 = Math.ceil(dis2 / tim2);
                        System.out.println("Средняя скорость " + sp2 + " км/ч\n");

                        Scanner scan = new Scanner(System.in);
                        System.out.print("Введите название города: ");
                        String phrase = scan.nextLine();
                        System.out.print("Введите расстояние: ");
                        Double ras = scan.nextDouble();
                        System.out.print("Введите время в пути: ");
                        Double time = scan.nextDouble();
                        System.out.println("От города " + phrase + " до города Сочи " + ras + " км ");
                        System.out.println("Время в пути " + time + " часов ");
                        System.out.println("Затраты на поездку: ");
                        Route r3 = new Route(phrase, "Сочи", ras);
                        Time t3 = new Time(0,time);
                        double dis3 = r3.route();
                        double tim3 = t3.time();
                        double sp3 = Math.ceil(dis3 / tim3);
                        System.out.println("Средняя скорость " + sp3 + " км/ч\n");

                        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

                        ArrayList<String> alist = new ArrayList<>();
                        //alist.add(String.valueOf(dis));
                        //alist.add(String.valueOf(dis1));
                        //alist.add(String.valueOf(dis2));
                        alist.add(String.valueOf(dis3));
                        ArrayList<String> blist = new ArrayList<>();
                        //blist.add(String.valueOf(tim));
                        //blist.add(String.valueOf(tim1));
                        //blist.add(String.valueOf(tim2));
                        blist.add(String.valueOf(tim3));
                        ArrayList<String> clist = new ArrayList<>();
                        //clist.add(String.valueOf(sp));
                        //clist.add(String.valueOf(sp1));
                        //clist.add(String.valueOf(sp2));
                        clist.add(String.valueOf(sp3));

                        try(BufferedWriter writer = new BufferedWriter(new FileWriter("File.txt"))){
                                writer.write("От города " + phrase + " до города Сочи " + ras + " км\n");
                                writer.write("Время в пути " + time + " часов\n");
                                writer.write("Затраты на поездку: \n");
                                writer.write("Сумма денег необходимая на бензин - A95: " + String.valueOf(alist) + " рублей\n");
                                writer.write("Потраченное время - " + String.valueOf(blist) + " часов\n");
                                writer.write("Средняя скорость - " + String.valueOf(clist) + " км/час");
                                System.out.println("Данные сохранены");
                        }catch (IOException e){
                                e.printStackTrace();
                        }
                } catch (Exception ex) {
                        System.err.println(ex);
                }
        }
}