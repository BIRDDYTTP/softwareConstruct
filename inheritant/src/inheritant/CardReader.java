package inheritant;

public class CardReader {
    public void spend(MoneyCard m, double money){
        m.spend(money);
    }
    public void addLimit(MoneyCard m, double limit){
        m.addLimit(limit);
    }
}
