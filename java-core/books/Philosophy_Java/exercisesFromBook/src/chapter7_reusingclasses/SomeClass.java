package chapter7_reusingclasses;

import chapter7_reusingclasses.expackage.ExClass;

public class SomeClass {
    public static void main(String[] args) {
        SomeClass1 someClass1 = new SomeClass1();
        /*
        someClass1.method();
        не можем вызвать так как у method()
        модификатор доступа protected
         */


    }
}
