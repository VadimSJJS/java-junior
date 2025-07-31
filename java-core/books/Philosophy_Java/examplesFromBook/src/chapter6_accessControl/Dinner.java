package chapter6_accessControl;

import chapter6_accessControl.dessert.Cookie;

public class Dinner {
    public static void main(String[] args) {
        Cookie x = new Cookie();
        // x.bite(); обращение невозможно
    }
}
