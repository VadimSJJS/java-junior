package chapter3_operators;

class Car {
    float speed;
}

public class ExPassObject {
    static void setSpeed(Car car) {
        car.speed = 88.8F;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.speed = 42.8F;
        System.out.println("car.speed=" + car.speed);

        setSpeed(car);
        System.out.println("car.speed=" + car.speed);
    }
}
