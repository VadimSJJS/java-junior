package chapter5_initializationAndTermination;

/*
Создайте класс с конструктором по умолчанию
(без параметров), который выводит на экран
сообщение. Создайте объект этого класса
 */


/*
Добавьте к классу перегруженный конструктор, принимающий в качестве параметра строку
(String) и распечатывающий ее вместе с сообщением
 */
class A {
    public A() {
        System.out.println("Конструктор по умолчанию");
    }

    public A(String message) {
        System.out.println("message: " + message);
    }
}

public class ExContructor2 {
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A("Конструктор с 1 параметром");
    }
}
