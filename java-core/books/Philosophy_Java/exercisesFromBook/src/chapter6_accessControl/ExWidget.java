package chapter6_accessControl;

import chapter6_accessControl.access.Widget;
/*
Создайте объект Widget в классе, не входящем в
пакет access
 */
public class ExWidget {
    public static void main(String[] args) {
        Widget widget = new Widget();
    }
}
