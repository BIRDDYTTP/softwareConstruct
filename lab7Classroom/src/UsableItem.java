public class UsableItem extends Item {
    private String type;
    private int ability;

    public UsableItem(String name, int price, String type, int ability) {
        super(name,price);
        if (type.toLowerCase() != "heal" && type != "increaseDam" && type != "increaseDef"){
            throw new IllegalArgumentException("Type Error");
        }
        this.type = type;
        this.ability = ability;
    }
    public String getType(){
        return type;
    }

    public int getAbility() {
        return ability;
    }

    public void used(){
        super.sell(1);
    }
}
