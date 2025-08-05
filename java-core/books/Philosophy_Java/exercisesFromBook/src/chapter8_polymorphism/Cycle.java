package chapter8_polymorphism;
/*
Создайте класс Cycle с производными классами Unicycle, Bicycle и Tricycle. Покажите, что
экземпляр каждого из производных типов может быть преоьразован в Cycle, на примере вызова метода ride().
 */
public class Cycle {
    public void ride() {
        System.out.println("Cycle.ride()");
    }

    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        Cycle unicycle = new Unicycle();
        Cycle bicycle = new Bicycle();
        Cycle tricycle = new Tricycle();

        cycle.ride();
        unicycle.ride();
        bicycle.ride();
        tricycle.ride();
    }
}

class Unicycle extends Cycle {
    public void ride() {
        System.out.println("Unicycle.ride()");
    }
}

class Bicycle extends Cycle {
    public void ride() {
        System.out.println("Bicycle.ride()");
    }
}

class Tricycle extends Cycle {
    public void ride() {
        System.out.println("Tricycle.ride()");
    }
}