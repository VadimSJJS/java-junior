package chapter10_innerclasses.ex7;

/*
(7) Создайте класс, содержащий закрытое поле и закрытый метод. Создайте внутренний
класс с методом, который изменяет поле внешнего класса и вызывает метод внешнего
класса. Во втором методе внешнего класса создайте объект внутреннего класса и
вызовите его метод; продемонстрируйте эффект на объекте внешнего класса.
 */

/*
(8) Проверьте, доступны ли для внешнего класс закрытые элементы внутреннего класса.
 */

public class OuterClass {
    private int id;
    private void method() {
        System.out.println("OuterClass method() and id = " + id);
        // System.out.println("InnerClass.age = ", age); внешний класс не имеет доступ к закрытым элементам внутреннего класса
    }

    public void method2() {
        InnerClass innerClass = new InnerClass();
        innerClass.setId(3);
    }

    class InnerClass {
        private int age = 2;
        public void setId(int id) {
            OuterClass.this.id = id;
            method();
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.method();
        outerClass.method2();
    }
}
