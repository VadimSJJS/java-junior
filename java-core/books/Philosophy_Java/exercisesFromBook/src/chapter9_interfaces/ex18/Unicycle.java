package chapter9_interfaces.ex18;

public class Unicycle implements Cycle {
    @Override
    public void drive() {
        System.out.println("Unicycle drives");
    }
}

class UnicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}