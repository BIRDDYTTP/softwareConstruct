import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashierTest {
    @Test
    void sell_ShouldIncrease_WhenUsePromptpayStrategy(){
        ShoppingCart cart = new ShoppingCart();
        Cashier cashier = new Cashier(9999);
        Account account = new Account("Ken");
        account.deposit(1000);
        PaymentStrategy promptpay = new PromptPay("080-999-9999", account);
        cart.addItem(new Item("Mouse", 500));
        cashier.sell(cart, promptpay);
        assertEquals(9999+500,cashier.getMoney());
        assertEquals(1000-500,account.getBalance() );
    }

    @Test
    void sell_ShouldIncrease_WhenUseCreditCardStrategy(){
        Account account = new Account("Ken");
        account.deposit(100);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("Ipad Pro 2018", 28900));
        cart.addItem(new Item("Apple Pencil 2", 4490));

        Cashier cashier = new Cashier(9999);
        PaymentStrategy creditCard = new CreditCard("8888-5412-1124-7986", account, 100000);

        cashier.sell(cart, creditCard);
        assertEquals(9999+28900+4490, cashier.getMoney());
        assertEquals(28900+4490, ((CreditCard) creditCard).getDebt());
        assertEquals(100, account.getBalance());
    }
}