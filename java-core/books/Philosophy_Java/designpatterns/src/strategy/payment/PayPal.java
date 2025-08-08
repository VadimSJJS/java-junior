package strategy.payment;

public class PayPal implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата PayPal на сумму: " + amount + " руб.");
    }
}
