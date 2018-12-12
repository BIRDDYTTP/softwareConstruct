package inheritant;

public class Main {
    public static void main(String[] args) {
        MoneyCard m = new MoneyCard(200000, "Prasert");
        DabitCard d = new DabitCard(4000, "Cris");
        CardReader c = new CardReader();
        System.out.println(m.toString());
        System.out.println(d.toString());
        c.addLimit(d, 1000);
        c.addLimit(m, 200000);
        c.spend(d, 300);
        c.spend(m, 90000);
        System.out.println(m.toString());
        System.out.println(d.toString());
    }
}
