package chapter9_interfaces.ex19;

public class CoinFactory extends ThrowableFactory {
    @Override
    Throwable createThrowable() {
        return new Coin();
    }
}
