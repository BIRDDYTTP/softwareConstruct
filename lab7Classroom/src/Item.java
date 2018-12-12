public class Item {
    private String name;
    private int quantity;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public void sell(int quantity){
        this.quantity -= quantity;
    }

    public void add(int quantity){
        this.quantity += quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }
}
