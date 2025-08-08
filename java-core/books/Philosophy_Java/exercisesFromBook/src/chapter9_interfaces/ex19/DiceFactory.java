package chapter9_interfaces.ex19;

public class DiceFactory extends ThrowableFactory {
    @Override
    Throwable createThrowable() {
        return new Dice();
    }
}
