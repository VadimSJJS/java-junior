package chapter5_initializationAndTermination;

/*
Создайте класс Dog (собака) с перегруженным методом bark() (лай). Метод должен быть
перегружен для разных примитивных типов данных с целью вывода сообщения о лае, завывании,
поскуливании и т.п. в зависимости от версии перегруженного метода. Напишите метод
main(), вызывающий все версии.
 */

public class Overloading2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.bark(true);
        dog.bark(true, true);
        dog.bark(true, true, true);
    }
}

class Dog {
    public void bark() {
        System.out.println("Перегруженный метод без параметров");
    }

    public void bark(boolean isBarking, boolean isHowl, boolean isWhining) {
        System.out.println("Перегруженный метод с 3 параметрами");
        System.out.printf("isBarking = %b, isHowl = %b, isWhining = %b\n", isBarking, isHowl, isWhining );
    }

    public void bark(boolean isBarking, boolean isHowl) {
        System.out.println("Перегруженный метод с 2 параметрами");
        System.out.printf("isBarking = %b, isHowl = %b\n", isBarking, isHowl);
    }

    public void bark(boolean isBarking) {
        System.out.println("Перегруженный метод с 1 параметром");
        System.out.printf("isBarking = %b\n", isBarking);
    }
}