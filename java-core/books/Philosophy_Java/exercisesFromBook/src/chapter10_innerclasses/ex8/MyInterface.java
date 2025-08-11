package chapter10_innerclasses.ex8;

/*
(8) Создайте интерфейс, содержащий минимум один метод. Реализуйте его, определив
внутренний класс в методе, который возвращает ссылку на ваш интерфейс.
 */

public interface MyInterface {
    void method();
}

class OuterClass {
    public MyInterface createImplementation() {
        class LocalInnerClass implements MyInterface {
            @Override
            public void method() {

            }
        }

        return new LocalInnerClass();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        MyInterface instance = outer.createImplementation();
        instance.method();
    }
}