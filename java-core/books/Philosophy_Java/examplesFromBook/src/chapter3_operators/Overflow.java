package chapter3_operators;

public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("большое = " + big);
        int bigger = big * 4;
        System.out.println("Еще больше = " + bigger);
    }
}
