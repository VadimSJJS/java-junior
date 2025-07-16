package chapter3_operators;

/*
Покажите, что шестнадцатеричная и восьмеричная записи
могут использоваться с типом long. Для вывода результатов используйте метод
Long.toBinaryString
 */

public class ExLiterals {
    public static void main(String[] args) {
        long digit_16 = 0x6F;
        long digit_8 = 041;

        System.out.println(digit_16 + ": " + Long.toBinaryString(digit_16));
        System.out.println(digit_8  + ": " + Long.toBinaryString(digit_8));
    }
}
