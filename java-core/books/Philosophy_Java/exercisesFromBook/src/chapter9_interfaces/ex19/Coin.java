package chapter9_interfaces.ex19;

public class Coin implements Throwable {

    @Override
    public void throwItem() {
        String result = Math.random() > 0.5 ? "Орёл" : "Решка";
        System.out.println("Бросок монеты: " + result);
    }
}
