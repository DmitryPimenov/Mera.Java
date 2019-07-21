package dmitrypimenov;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.stream.Collectors;
import java.util.Collection;
import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
                try {
                        int x = 0;
                        Family s;
                        s = new Family("Сидоровых");
                        s.setAmount(4);
                        s.setCity("Новосибирск");
                        System.out.print(++x + ". ");
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
                        double sp = dis / tim;
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
                        double sp1 = dis1 / tim1;
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
                        double sp2 = dis2 / tim2;
                        System.out.println("Средняя скорость " + sp2 + " км/ч");

                        //System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

                        ArrayList<String> family = new ArrayList<String>();
                        family.add("Сидоровы. ");
                        family.add("Петровы. ");
                        family.add("Ивановы. ");
                        //System.out.println(family);

                        //System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

                        ArrayList<String> auto = new ArrayList<String>();
                        auto.add("BMW. ");
                        auto.add("VW. ");
                        auto.add("AUDI. ");
                        //System.out.println(auto);

                        /*System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

                        ArrayList<Double> route1 = new ArrayList<Double>();
                        route1.add(r.fuel());
                        route1.add(r1.fuel1());
                        route1.add(r2.fuel2());
                        System.out.println(route1);

                        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

                        ArrayList<Double> route2 = new ArrayList<Double>();
                        route2.add(r.averagefuel());
                        route2.add(r1.averagefuel1());
                        route2.add(r2.averagefuel2());
                        System.out.println(route2);

                        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

                        boolean isEquel = family.equals(auto);
                        System.out.println(isEquel);
                        boolean isString = family.stream().filter(name -> auto.contains(name)).count() > 0;
                        System.out.println(isString);
                        boolean isThirdSubsetOfFirst = family.containsAll(auto);
                        System.out.println(isThirdSubsetOfFirst);*/

                        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

                        System.out.println("Привет! Выбери героев и автомобиль!");
                        List<String> newList = Stream.of(family, auto)
                                .flatMap(Collection::stream)
                                .collect(Collectors.toList());
                        //System.out.println(newList);
                        Scanner a = new Scanner(System.in);
                        Map<Integer, String> hashMap = new HashMap<>();
                        hashMap.put(0, newList.get(0));
                        hashMap.put(1, newList.get(1));
                        hashMap.put(2, newList.get(2));
                        hashMap.put(3, newList.get(3));
                        hashMap.put(4, newList.get(4));
                        hashMap.put(5, newList.get(5));
                        System.out.println(hashMap);
                        System.out.println(a.nextLine());
                        Map<Family, List<Automobile>> personMap = new HashMap<>();
                        personMap.put(new Family("Сидоровы"), Arrays.asList(new Automobile(),new Automobile(),new Automobile()));
                        personMap.put(new Family("Петровы"), Arrays.asList(new Automobile(),new Automobile(),new Automobile()));
                        personMap.put(new Family("Ивановы"), Arrays.asList(new Automobile(),new Automobile(),new Automobile()));

                        System.out.println("personMap: " + personMap);
                        System.out.println("personMap.keySet(): " + personMap.keySet());

                        for(Family person : personMap.keySet()){
                                System.out.println(person + " имеют");
                                for (Automobile aut : personMap.get(person)){
                                        System.out.println("  " + aut);
                                }
                        }

                        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

                        String path = "File.txt";
                        File file = new File(path);
                        if (!file.exists()) {
                                file.createNewFile();
                        }
                        FileWriter fw = new FileWriter(file.getAbsoluteFile());
                        BufferedWriter bw = new BufferedWriter(fw);
                        for (int l = 0; l < newList.size(); l++) {
                                String stuffToWrite = newList.get(l);
                                bw.write(stuffToWrite);
                        }
                        bw.close();
                        System.out.println("Данные сохранены");
                } catch (IOException ex) {
                        System.err.println(ex);
                }
        }
}
