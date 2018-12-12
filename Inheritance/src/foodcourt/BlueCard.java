package foodcourt;

public class BlueCard extends FoodCenterCard{

    private int point;

    public BlueCard(){
        super();
        this.point = 0;
    }

    @Override
    public void topUp(double money) {
        super.topUp(money);
        this.point += ((int) (money/200)) *10;
    }

    @Override
    public void spend(double purchase) {
        super.spend(purchase);
        point += ((int) (purchase/50))*2;
    }
    public void usedPoint(int point){
        if (point > this.point){
            throw new IllegalArgumentException("point is insufficient");
        }
        else{
            this.point -= point;
        }
    }

    public int getPoint() {
        return point;
    }
}
