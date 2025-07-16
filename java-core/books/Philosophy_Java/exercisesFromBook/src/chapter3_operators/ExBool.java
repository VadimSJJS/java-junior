package chapter3_operators;

/*
Напишите программу, моделирующую бросок монетки
 */

import java.util.Random;

public class ExBool {
    public static void main(String[] args) {
        Random random = new Random();

        int result = random.nextInt(2); // 0 или 1

        // Пусть 0 - это решка, а 1 - это орел
        String str = result == 0 ? "Выпала решка" : "Выпал орел";
        System.out.println(result + " - " + str);
    }
}
