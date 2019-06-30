import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class Files {
    public static void main(String[] args){
    try{
            Formatter f = new Formatter("Files.xml");
            f.format("%s %s %s", "1", "Sidorovi", "BMW \r\n");
            f.format("%s %s %s", "2", "Ivanovi", "AUDI");
            f.close();

            File x = new File("Files.xml");
            Scanner sc = new Scanner(x);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}
