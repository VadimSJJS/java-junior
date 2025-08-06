package chapter8_polymorphism;

public class Car {
    public void first() {
        System.out.println("Car starts");
    }

    public void second() {
        first();
        System.out.println("Car drives");
    }

    public static void main(String[] args) {
        Audi audi = new Audi();
        System.out.println(audi.getClass());

        Car car = audi; // восходящее преобразование, преобразуем наследуемый класс к базовому
        System.out.println(car.getClass());
        car.second();
    }
}

class Audi extends Car {
    @Override
    public void second() {
        System.out.println("Audi drives");
    }
}
