package chapter6_accessControl;

import chapter6_accessControl.dessert.Cookie;

public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("Конструктор ChocolateChip");
    }

    public void chomp() {
        // Если у метода указать модификатор доступа
        // protected тогда он станет доступным
        // bite(); Метод bite недоступен
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}
