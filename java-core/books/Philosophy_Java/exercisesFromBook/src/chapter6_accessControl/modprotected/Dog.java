package chapter6_accessControl.modprotected;

public class Dog extends Animal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.run();
        // animal.sleep(); // нельзя так как private
        Dog dog = new Dog();
        dog.run(); // можем вызвать run так как protected
        dog.see();
    }
}
