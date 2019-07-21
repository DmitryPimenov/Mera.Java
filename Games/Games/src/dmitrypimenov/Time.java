package dmitrypimenov;

public class Time {
    double start;
    double finish;

    Time(int s, int f){
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
