package chapter6_accessControl;

/*
Определите класс в пакете. Создайте
экземпляр класса за пределами пакета
 */

import chapter6_accessControl.exmypackage.ExClass;

public class ExMyClass {
    public static void main(String[] args) {
        ExClass exClass = new ExClass();
    }
}
