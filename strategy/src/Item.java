public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        if (price < 0){
            price = 0;
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
