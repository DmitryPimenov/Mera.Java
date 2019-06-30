public class Family {
    public String name;
    private int amount;

    Family(String n) {
        this.name = n;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int a) {
        this.amount = a;
    }
}