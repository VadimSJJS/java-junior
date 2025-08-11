package chapter10_innerclasses.ex5;

/*
Создайте класс с внутренним классом. В отдельном классе создайте экземпляр внутреннего класса
 */

public class Outer {
    class Inner {

    }
}

class AnotherClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
    }
}