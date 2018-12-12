public class Main {
    public static void main(String[] args) {
        GameCharacter g1 = new GameCharacter("A");
        UsableItem fruit = new UsableItem("Grape", 20, "heal",30);
        MonsterBall drive = new MonsterBall("drive",1000);
        g1.receiveItem(fruit, 1);
        g1.receiveItem(drive,10);
        g1.receiveItem(fruit,1);
//        System.out.println(g1);
        Item flower = new Item("Flower", 10);
        g1.buy(flower, 1);
//        System.out.println(g1);
        Skill s1 = new Skill("punch");
        g1.learnSkill(s1);
//        System.out.println(g1);
        g1.sell(flower,1);
//        System.out.println(g1);
        g1.usedItem(fruit);
//        System.out.println(g1);
        g1.catchBy(drive);
        g1.catchBy(drive);
        g1.catchBy(drive);
        g1.catchBy(drive);
//        System.out.println(g1);
        ActiveSkill as1 = new ActiveSkill("Fire ball", "Fire Ballll!!!");
        g1.learnSkill(as1);
        System.out.println("Cast Skill >> "+g1.castSkill(as1)+" <<");
        System.out.println(g1);
    }
}
