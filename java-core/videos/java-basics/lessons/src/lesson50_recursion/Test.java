package lesson50_recursion;

public class Test {
    public static int i = 1;

    public static void main(String[] args) {
        System.out.println(fac(5));
    }

    private static int fac(int n) {
        if (n == 1) {
            return 1;
        }

        return n * fac(n - 1 );
    }
}
