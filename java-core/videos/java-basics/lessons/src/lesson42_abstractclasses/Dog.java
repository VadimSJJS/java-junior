package lesson42_abstractclasses;

public class Dog implements  AbleToMakeSound {
    @Override
    public void makeSound() {
        System.out.println("bark");
    }
}
