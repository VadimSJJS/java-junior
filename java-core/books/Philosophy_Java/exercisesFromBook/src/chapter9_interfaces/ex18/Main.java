package chapter9_interfaces.ex18;

public class Main {

    public static void drive(CycleFactory factory) {
        Cycle cycle = factory.getCycle();
        cycle.drive();
    }
    public static void main(String[] args) {
        drive(new UnicycleFactory());
        drive(new BicycleFactory());
        drive(new TricycleFactory());
    }
}
