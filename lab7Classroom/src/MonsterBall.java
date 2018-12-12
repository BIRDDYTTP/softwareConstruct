public class MonsterBall extends Item {
    public MonsterBall(String name, int price) {
        super(name, price);
        if (name.toLowerCase() != "poke" && name.toLowerCase() != "great" && name.toLowerCase() != "ultra" && name.toLowerCase() != "drive"){
            throw new IllegalArgumentException("Type Error");
        }
    }

    public String getType(){
        return super.getName();
    }

    public void used(){
        super.sell(1);
    }

}
