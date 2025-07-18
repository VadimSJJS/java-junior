package lesson26_inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        Dog dog = new Dog();
        dog.sleep();
        dog.eat();
        dog.bark();
        dog.showName();
    }
}
