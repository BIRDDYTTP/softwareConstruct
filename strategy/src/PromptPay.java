public class PromptPay implements PaymentStrategy {
    private String identity;
    private Account account;

    public PromptPay(String identity, Account account){
        this.identity = identity;
        this.account = account;
    }
    @Override
    public boolean pay(double cost) {
        double old = account.getBalance();
        account.withdraw(cost);
        double current = account.getBalance();
        return old > current;
    }
}
