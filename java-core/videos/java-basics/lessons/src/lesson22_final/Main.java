package lesson22_final;

public class Main {
    public static void main(String[] args) {
        final int X = 10;
        System.out.println(X);
        // X = 5; // Нельзя менять константу
    }
}

class Test {
    public static final int CONSTANT = 0;


}