package strategy.payment;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setPayment(new CreditCard());
        shoppingCart.pay(42.2);

        shoppingCart.setPayment(new PayPal());
        shoppingCart.pay(142.2);

        shoppingCart.setPayment(new Crypto());
        shoppingCart.pay(178.2);
    }
}
