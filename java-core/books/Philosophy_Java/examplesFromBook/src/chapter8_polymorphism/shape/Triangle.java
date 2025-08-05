package chapter8_polymorphism.shape;

public class Triangle extends Shape {
    @Override
    public void printMessage() {
        System.out.println("Triangle message");
    }

    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }
}
