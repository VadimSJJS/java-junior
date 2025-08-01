package chapter7_reusingclasses;

/*
Создайте простой класс. Во втором классе определите
ссылку на объект первого класса. Используйте отложенную
инициализацию для создания экземпляров этого класса
 */

public class SimpleClass1 {
    private int id;

    public String toString() {
        return "id: " + ++id;
    }
}
