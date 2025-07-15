package chapter3_operators;

public class Precedence {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        int b = x + (y - 2) / (2 + z);
        System.out.println("x = " + x + " b = " + b);
    }
}
