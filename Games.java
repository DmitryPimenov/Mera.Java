package Games;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collections;

interface Run{
  void run();
}
class Person implements Run{
  // ???????
  public void run(){
    System.out.println("Speed");
  }
}
public class Games {

  public static void main(String[] args) {
  
  System.out.println("Привет! Выбери героя и укажи сколько будет у него энергии. Введи любое число 3 раза");
  
  Scanner input = new Scanner (System.in);
  try{
  HashMap <Integer, String> ss = new HashMap <Integer, String>();
  ss.put(input.nextInt(),"Светлана");
  ss.put(input.nextInt(),"Петр");
  ss.put(input.nextInt(),"Андрей"); 
  System.out.println(ss);
  System.out.println(ss.get(input.nextInt()));
  //System.out.println(ss.containsKey(input.nextInt()));
  
  Iterator<Integer> itr1 = ss.keySet().iterator();
while(itr1.hasNext())
    System.out.println(itr1.next());

  Iterator<String> itr2 = ss.values().iterator();
while (itr2.hasNext())
    System.out.println(itr2.next());
    
  }catch(Exception e){
    System.out.println("Error");
  }
  
  
  System.out.println("Выбери куда поедет твой герой и укажи сколько энергии он потратит на это мероприятие. Введи любое число 3 раза");
  
  try{
  HashMap <Integer, String> ss1 = new HashMap <Integer, String>();
  
  //while(ss1 < ss)???
  
  ss1.put(input.nextInt(),"На день рождение");
  ss1.put(input.nextInt(),"В детский оздровительный лагерь");
  ss1.put(input.nextInt(),"К бабушке и дедушке"); 
  System.out.println(ss1);
  System.out.println(ss1.get(input.nextInt()));
  //System.out.println(ss1.containsKey(input.nextInt()));
  
  Iterator<Integer> itr3 = ss1.keySet().iterator();
while(itr3.hasNext())
    System.out.println(itr3.next());

  Iterator<String> itr4 = ss1.values().iterator();
while (itr4.hasNext())
    System.out.println(itr4.next());
    
  }catch(Exception e){
    System.out.println("Error");
  }
}
}
