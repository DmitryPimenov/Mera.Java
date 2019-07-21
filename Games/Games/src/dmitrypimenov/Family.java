package dmitrypimenov;

public class Family {
    public String name;
    public String city;
    public int amount;

    Family(String n) {
        this.name = n;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String c) {
        this.city = c;
    }

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
