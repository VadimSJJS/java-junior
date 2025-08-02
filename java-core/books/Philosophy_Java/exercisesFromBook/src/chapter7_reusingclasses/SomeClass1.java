package chapter7_reusingclasses;

import chapter7_reusingclasses.expackage.ExClass;

public class SomeClass1 extends ExClass {
    public static void main(String[] args) {
        SomeClass1 someClass1 = new SomeClass1();
        someClass1.method();
        // можно вызвать protected method()
        // потому что это производный класс
    }
}
