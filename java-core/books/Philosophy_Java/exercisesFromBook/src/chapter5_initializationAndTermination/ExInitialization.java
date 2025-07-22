package chapter5_initializationAndTermination;

/*
Создайте класс с неинициализированной ссылкой на
String. Покажите, что Java инициализирует ссылку
значением null
 */

class Person {
    String name;
}

public class ExInitialization {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("person.name = " + person.name);
    }
}
