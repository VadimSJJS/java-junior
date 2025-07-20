package chapter4_controlStructures;

import java.util.Random;

/*
Измените управжнение 2 так, чтобы код выполнянлся в
бесконечном цикле while. Программа работать до тех
пор, пока ее выполнение не будет прервано с клавиатуры
(как правило, нажатием клавиш Ctrl+C)
 */

public class ExIfElseInfinity {
    public static void main(String[] args) {
        Random rand = new Random();
        while (true) {
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
