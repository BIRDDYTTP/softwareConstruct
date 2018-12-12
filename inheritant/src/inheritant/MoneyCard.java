package inheritant;

public class MoneyCard {
    private double limit;
    private String name;

    public MoneyCard(double limit, String name) {
        this.limit = limit;
        this.name = name;
    }

    public void addLimit(double limit){
        this.limit += limit;
    }

    public void spend(double money){
        if (money <= limit){
            this.limit -= money;
        }
        else{
            throw new IllegalArgumentException("Not enough money");
        }
    }

    @Override
    public String toString() {
        return name+"'s Card Financial amount: " + limit;
    }

    public double getLimit() {
        return limit;
    }
}
