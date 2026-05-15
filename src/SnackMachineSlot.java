public class SnackMachineSlot {

    private String item;
    private double price;
    private int amount;
    private int sold;
    private double money;

    public SnackMachineSlot(String i, double p, int a) {
        item = i;
        price = p;
        if (price <= 0) {
            price = 0.0;
        }
        amount = a;
        if (amount <= 0) {
            amount = 0;
        }
        money = 0;
    }

    public void purchaseOne() {
        if (amount > 0) {
            amount--;
            sold++;
        } else {
            amount += 0;
            sold += 0;
        }
        money+=price;
    }

    public double getRevenue() {
        money=price*sold;
        return money;
    }

    public String toString() {
        return "Item: " + item + ", Price: " + price + ", In Stock: " + amount + ", Amount sold: " + sold + ", Total: "
                + money;

    }
}
