package chapter9_interfaces.ex18;

public class Bicycle implements Cycle {
    @Override
    public void drive() {
        System.out.println("Bicycle drives");
    }
}

class BicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}