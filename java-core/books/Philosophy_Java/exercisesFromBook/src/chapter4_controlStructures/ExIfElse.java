package chapter4_controlStructures;

/*
(2) Напишите программу, которая генерирует 25 случайных значений типа int. Для
каждого значения команда if-else сообщает, в каком отношении оно находится
с другим случайно сгенерированным значением (больше, меньше, равно).
 */

import java.util.Random;

public class ExIfElse {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 25; i++) {
            int num1 = rand.nextInt(25);
            int num2 = rand.nextInt(25);
            System.out.print("Пара: " + num1 + " и " + num2 + " - ");
            if (num1 > num2) {
                System.out.printf("num1(%d) > num2(%d)\n", num1, num2);
            } else if (num1 < num2) {
                System.out.printf("num1(%d) < num2(%d)\n", num1, num2);
            } else {
                System.out.printf("num1(%d) = num2(%d)\n", num1, num2);
            }
        }
    }
}
