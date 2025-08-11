package chapter10_innerclasses.ex1;

/*
(1) Напишите класс с именем Outer, содержащий внутренний класс с именем Inner.
Добавьте в Outer метод, возвращающий объект типа Inner. В методе main()
создайте и инициализируйте ссылку на Inner
 */

/*
(3) Измените упражнение 1 так, чтобы класс Outer содержал закрытое поле String (инициализируемое в конструкторе),
а класс Inner содержал метод toString() для вывода этого поля. Создайте объект типа Inner и выведите его.
 */

public class Outer {
    private String str;

    public Outer(String str) {
        this.str = str;
    }

    class Inner {
        @Override
        public String toString() {
            return "Переменная str из внешнего класса Outer: " + str;
        }
    }

    public Inner getInner() {
        System.out.println("return Inner()");
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer("String from class Outer");
        outer.getInner();
        System.out.println(outer.getInner());
    }
}
