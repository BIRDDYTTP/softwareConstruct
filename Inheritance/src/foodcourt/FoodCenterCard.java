package foodcourt;

public class FoodCenterCard {
    private double balance;;

    public FoodCenterCard() {
        this.balance = 0;
    }

    public void topUp(double money){
        if (money < 0)
            throw new IllegalArgumentException("money must be positive");
        else {
            this.balance += money;
        }
    }

    public void spend(double purchase){
        if (purchase < 0)
            throw new IllegalArgumentException("money must be positive");
        else{
            this.balance -= purchase;
        }
    }

    public double getBalance() {
        return balance;
    }
}
