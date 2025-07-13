package lesson11_arrays;

public class Main {
    public static void main(String[] args) {
        int number = 10; // примитивный тип данных
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
