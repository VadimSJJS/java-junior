package strategy.payment;

public class Crypto implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата криптовалютой на сумму: " + amount + " руб.");
    }
}
