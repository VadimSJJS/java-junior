package chapter9_interfaces.ex19;

public class Dice implements Throwable {
    @Override
    public void throwItem() {
        int result = (int)(Math.random() * 6) + 1;
        System.out.println("Бросок кубика: " + result);
    }
}
