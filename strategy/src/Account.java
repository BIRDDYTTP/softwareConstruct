public class Account {
    private double balance;
    private String name;

    public Account(String name) {
        this.name = name;
    }

    public void deposit(double money){
        if (money > 0){
            balance += money;
        }
    }

    public void withdraw(double money){
        if (balance > money && money > 0){
            balance -= money;
        }
    }

    public double getBalance() {
        return balance;
    }
}
