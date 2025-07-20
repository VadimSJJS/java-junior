package chapter4_controlStructures;

/* Вампирами называются числа, состоящие из четного
количества цифр и полученные перемножением пары чисел,
каждое из которых содержит половину цифр результата.
Цифры берутся из исходного числа в произвольном порядке,
завершающие нули недопустиым. Пример:
1) 1261 = 21 * 60;
2) 1827 = 21 * 87;
3) 2187 = 27 * 81;

*/

public class ExVampire {
    public static void main(String[] args) {
        System.out.println(1261 / 1000);
        System.out.println((1261 / 100) % 10);
        System.out.println((1261 / 10) % 10);
        System.out.println(1261 % 10);
    }

    public static void getVampires() {
        for (int i = 1000; i <= 9999; i++) {
            int num1 = i / 1000;
            int num2 = (i / 100) % 10;
            int num3 = (i / 10) % 10;
            int num4 = i % 10;
        }
    }
}
