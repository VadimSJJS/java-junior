package strategy.payment;

public class CreditCard implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата кредитной картой на сумму: " + amount + " руб.");
    }
}
