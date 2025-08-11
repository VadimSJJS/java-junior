package chapter10_innerclasses.ex6_continue;

import chapter10_innerclasses.ex6.MyInterface;

public class OuterClass {
    protected class InnerClass implements MyInterface {

        @Override
        public void myMethod() {
            System.out.println("InnerEx6Class method()");
        }
    }
}
