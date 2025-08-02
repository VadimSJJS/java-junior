package lesson42_abstractclasses;

public abstract class Animal {
    public void eat() {
        System.out.println("I am eating...");
    }

    public abstract void makeSound();
}
