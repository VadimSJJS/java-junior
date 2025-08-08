package chapter9_interfaces.ex19;

public abstract class ThrowableFactory {
    abstract Throwable createThrowable();

    void simulateThrow() {
        Throwable item = createThrowable();
        item.throwItem();
    }
}
