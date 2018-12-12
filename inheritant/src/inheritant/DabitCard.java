package inheritant;

public class DabitCard extends MoneyCard {

    public DabitCard(double limit, String name) {
        super(limit, name);
    }

    @Override
    public void addLimit(double limit) {
        super.addLimit(limit*1.07);
    }

    @Override
    public void spend(double money) {
        if (money > super.getLimit()){
            throw new IllegalArgumentException("Not enough money");
        }
        super.spend(money*0.97);
    }

}
