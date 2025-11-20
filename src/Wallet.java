public class Wallet {

    private String color;
    private String size;
    private int money;
    private boolean open;
    private boolean lost;

    public Wallet(String color, String size) {
        this.color = color;
        this.size = size;
        this.money = 0;
        this.open = false;
        this.lost = false;
    }

    public void addVola(int amount) {
        this.money += amount;
    }

    public int getVola() {
        return this.money;
    }

    public void open() {
        this.open = true;
    }

    public void close() {
        this.open = false;
    }

    public boolean isLost() {
        return this.lost;
    }

    public String checkVola() {
        return "Current money: " + this.money;
    }
}
