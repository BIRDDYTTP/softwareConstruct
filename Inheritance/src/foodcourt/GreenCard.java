package foodcourt;

public class GreenCard extends FoodCenterCard{

    @Override
    public void topUp(double money) {
        if (money > 200){
            super.topUp(money);
            super.topUp(((int) (money/200)) * 10);
        }
        else{
            super.topUp(money);
        }
    }


}
