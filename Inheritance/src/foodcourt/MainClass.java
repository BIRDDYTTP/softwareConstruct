package foodcourt;

public class MainClass {
    public static void main(String[] args) {
        CardReader reader = new CardReader();
        BlueCard b = new BlueCard();
        GreenCard g = new GreenCard();
        FoodCenterCard gray = new FoodCenterCard();

        reader.topUp(b, 300);
        reader.topUp(g,200);
        reader.topUp(gray, 100);
        reader.spend(gray, 30);

        System.out.println(b.getBalance() + " : " + g.getBalance() + " : "+gray.getBalance());
    }
}
