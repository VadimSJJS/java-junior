package chapter6_accessControl.modprotected;

public class Animal {
    public void see() {
        System.out.println("Animal see");
    }

    protected void run() {
        System.out.println("Animal run");
    }

    private void sleep() {
        System.out.println("Animal sleep");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        // вызванные методы находятся в одном классе
        animal.see();
        animal.run();
        animal.sleep();
    }
}

class Cat extends Animal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.see();
        animal.run();
    }
}