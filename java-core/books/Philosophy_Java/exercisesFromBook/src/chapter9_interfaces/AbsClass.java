package chapter9_interfaces;

public abstract class AbsClass {
    public static void main(String[] args) {
        // AbsClass absClass = new AbsClass(); ошибка
        SubClass1 subClass1 = new SubClass1();
        subClass1.method();
        subClass1.method();
    }
}

class SubClass1 extends AbsClass {
    public static void staticMethod(AbsClass absClass) {
        ((SubClass1)absClass).method();
    }

    public void method() {
        System.out.println("SubClass1 method()");
    }
}