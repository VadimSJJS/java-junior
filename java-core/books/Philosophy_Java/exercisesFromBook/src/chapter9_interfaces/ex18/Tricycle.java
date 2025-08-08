package chapter9_interfaces.ex18;

public class Tricycle implements Cycle {

    @Override
    public void drive() {
        System.out.println("Tricycle drives");
    }
}

class TricycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}