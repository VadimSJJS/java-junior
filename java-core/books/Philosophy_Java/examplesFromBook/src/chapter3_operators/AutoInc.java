package chapter3_operators;

public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i : " + i);
        System.out.println("++i : " + ++i); // Префиксный инкремент
        System.out.println("i++ : " + i++); // Постфиксный инкремент
        System.out.println("i : " + i);
        System.out.println("--i : " + --i); // Префиксный декремент
        System.out.println("i-- : " + i--); // Постфиксный декремент
        System.out.println("i : " + i);
    }
}
