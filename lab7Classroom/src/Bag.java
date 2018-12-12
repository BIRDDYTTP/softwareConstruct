import java.util.HashSet;

public class Bag {
    HashSet<Item> items = new HashSet<>();

    public boolean checkItem(Item item){
        return items.contains(item);
    }

    public void addItem(Item item){
        this.items.add(item);
    }

}
