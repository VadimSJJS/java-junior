package chapter7_reusingclasses;

public class ExStaticFinal {
    static final int number1 = 1;
    final int number2 = 2;

    public static void main(String[] args) {
        System.out.println(ExStaticFinal.number1);
        ExStaticFinal exStaticFinal = new ExStaticFinal();
        System.out.println(exStaticFinal.number2);
        System.out.println(number1);
    }
}
