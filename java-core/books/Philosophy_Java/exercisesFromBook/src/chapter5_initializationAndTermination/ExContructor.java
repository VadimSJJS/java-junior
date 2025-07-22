package chapter5_initializationAndTermination;

/*
Создайте класс с полем String, инициализируемым в
точке определения, и другим полем, иницилизируемым
конструктором. Чем отличаются эти два подхода?
 */

class Animal {
    String name = "Barsik";
    String type;

    public Animal(String type) {
        this.type = type;
    }
}

public class ExContructor {
    public static void main(String[] args) {
        // поле name инициализировано по умолчанию
        // поле type мы можем сами инициализировать
        // с помощью конструктора
        Animal animal = new Animal("Cat");

        System.out.println("animal.name = " + animal.name);
        System.out.println("animal.type = " + animal.type);


    }
}
