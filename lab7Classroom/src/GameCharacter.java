import java.util.ArrayList;
import java.util.Random;

public class GameCharacter {
    private String name;
    private Bag bag;
    private ArrayList<Skill> skills;
    private int hp;
    private int damage;
    private int defense;
    private int money;
    private int level;
    private double exp;


    public GameCharacter(String name) {
        this.name = name;
        this.bag = new Bag();
        this.skills = new ArrayList<>();
        this.exp = 0;
        this.level = 1;
        this.defense = 10;
        this.damage = 10;
        this.hp = 100;
        this.money = 10000;
    }

    public void learnSkill(Skill skill) {
        if (skills.contains(skill)) {
            skill.addLevel();
        } else {
            skills.add(skill);
        }
    }

    public void receiveItem(Item item, int quantity){
        if (bag.checkItem(item)){
            item.add(quantity);
        }
        else{
            item.add(quantity);
            bag.addItem(item);
        }
    }

    public void buy(Item item, int quantity){
        if (item.getPrice()*quantity <= money) {
            item.add(quantity);
            if (!bag.checkItem(item)) {
                bag.addItem(item);
            }
            this.money -= item.getPrice() * quantity;
        }
        else{
            throw new IllegalArgumentException("Not enough money");
        }
    }

    public void sell(Item item, int quantity){
        if (bag.checkItem(item)){
            if (quantity <= item.getQuantity()){
                item.sell(quantity);
            }else{
                throw new IllegalArgumentException("Not enough quantity to sell");
            }
            this.money += quantity*item.getPrice();
        }else{
            throw new IllegalArgumentException("Not have this Item in your bag");
        }
    }

    public void usedItem(UsableItem usableItem){
        if (bag.checkItem(usableItem)){
            if (usableItem.getQuantity() > 0){
                if (usableItem.getType().toLowerCase() == "heal"){
                    this.hp += usableItem.getAbility();
                }
                else if (usableItem.getType().toLowerCase() == "increaseDam"){
                    this.damage += usableItem.getAbility();
                }
                else if (usableItem.getType().toLowerCase() == "increaseDef"){
                    this.defense += usableItem.getAbility();
                }
                usableItem.used();
            } else{
                throw new IllegalArgumentException("Not enough quantity to used");
            }
        }else{
            throw new IllegalArgumentException("Not have this Item in your bag");
        }
    }

    public void catchBy(MonsterBall ball){
        Random rand = new Random();
        if (ball.getType().toLowerCase() == "poke"){
            int chance = rand.nextInt(10)+1;
            if (chance == 5){
                exp += 10/level;
            }
        }
        else if(ball.getType().toLowerCase() == "great"){
            int chance = rand.nextInt(10)+1;
            if (chance == 4 || chance == 5){
                exp += 10/level;
            }
        }
        else if(ball.getType().toLowerCase() == "ultra"){
            int chance = rand.nextInt(10)+1;
            if (chance == 3 || chance == 4 || chance == 5 ){
                exp += 10/level;
            }
        }
        else if(ball.getType().toLowerCase() == "drive"){
            int chance = rand.nextInt(10)+1;
            if (chance == 3 || chance == 4 || chance == 5 || chance == 6){
                exp += 10/level;
            }
        }
        ball.used();
        if (this.exp >= 100){
            this.level ++;
            this.exp -= 100;
        }
    }

    public String castSkill(ActiveSkill activeSkill){
        return activeSkill.getAbility();
    }

    @Override
    public String toString() {
        String re ="name = '" + name + "'" +
                "\nbag : \n" ;
        for (Item item : bag.items) {
            re += item.getName() +"  quantity : " + item.getQuantity() +"\n";
        }
        re +=  "skills : \n";
        for (Skill skill : skills) {
            re += skill.getSkillName() + "  level : " +skill.getLevel() + "\n";
        }
        re += "hp = " + hp +
                "\ndamage = " + damage +
                "\ndefense = " + defense +
                "\nmoney = " + money +
                "\nlevel = " + level +
                "\nexp = " + exp ;
        return re;
    }
}