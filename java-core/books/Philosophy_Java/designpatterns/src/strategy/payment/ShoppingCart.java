package strategy.payment;

public class ShoppingCart {
    private Payment payment;

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void pay(double amount) {
        payment.pay(amount);
    }
}
