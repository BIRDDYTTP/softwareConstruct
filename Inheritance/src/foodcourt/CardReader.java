package foodcourt;

public class CardReader {
    public void topUp(FoodCenterCard  fc, double money){
        fc.topUp(money);
    }
    public void spend(FoodCenterCard fc, double money){
        fc.spend(money);
    }
}
