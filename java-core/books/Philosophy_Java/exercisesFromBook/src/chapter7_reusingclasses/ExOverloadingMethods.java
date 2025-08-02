package chapter7_reusingclasses;

import org.w3c.dom.ls.LSOutput;

/*
Создайте класс с троекратно перегруженным методом.
Объявите новый класс производным от него, добавьте
новую перегрузку метода и покажите, что все четыре
метода доступны в производном классе.
 */

class Car {
    public void drive() {
        System.out.println("Car drive");
    }

    public void drive(int speed) {
        System.out.println("Car drive with speed " + speed);
    }

    public void drive(int speed, int countPassenger) {
        System.out.println("Car drive with speed " + speed + " and with countPassenger " + countPassenger);
    }
}

class Audi extends Car {
    public void drive(double speed) {
        System.out.println("Audi drive with spped " + speed);
    }

    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.drive();
        audi.drive(100);
        audi.drive(60, 4);
        audi.drive(150.5);
    }
}

public class ExOverloadingMethods {

}
