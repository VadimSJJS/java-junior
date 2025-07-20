package chapter4_controlStructures;

/*
Напишите программу, использующую два вложенных цикла
for и оператор остатка (%) для поиска и вывода простых
чисел (то есть целых чисел, не делящихся нацело ни на какое
другое число, кроме себя и 1)
 */

public class ExPrimeNumbers {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0 && i != j) {
                    isPrime = false;
                    continue;
                }
            }
            if (isPrime) {
                System.out.println("Число " + i + " является простым");
            }
        }
    }
}
