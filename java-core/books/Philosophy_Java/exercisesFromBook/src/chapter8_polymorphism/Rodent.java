package chapter8_polymorphism;

public class Rodent {
    public void run() {
        System.out.println("Rodent runs");
    }

    public void sleep() {
        System.out.println("Rodent sleeps");
    }

    public static void main(String[] args) {
        Rodent rodents[] = new Rodent[3];
        rodents[0] = new Rodent();
        rodents[1] = new Mouse();
        rodents[2] = new Hamster();

        rodents[0].run();
        rodents[0].sleep();

        rodents[1].run();
        rodents[1].sleep();

        rodents[2].run();
        rodents[2].sleep();
    }
}

class Mouse extends Rodent {
    @Override
    public void run() {
        System.out.println("Mouse runs");
    }

    @Override
    public void sleep() {
        System.out.println("Mouse sleeps");
    }
}

class Hamster extends Rodent {
    @Override
    public void run() {
        System.out.println("Hamster runs");
    }

    @Override
    public void sleep() {
        System.out.println("Hamster sleeps");
    }
}
