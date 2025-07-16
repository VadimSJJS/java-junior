package chapter3_operators;

public class Equivalence {
    public static void main(String[] args) {
        Integer n1 = 47;
        Integer n2 = 47;
        // == сравнивает ссылки, но так как в диапазоне
        // от -128 до 127 значния кэшируется происходит
        // valueof();
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
    }
}
