package chapter9_interfaces.ex19;

public class Main {
    public static void main(String[] args) {
        ThrowableFactory coinFactory = new CoinFactory();
        coinFactory.simulateThrow();

        ThrowableFactory diceFactory = new DiceFactory();
        diceFactory.simulateThrow();
    }
}
