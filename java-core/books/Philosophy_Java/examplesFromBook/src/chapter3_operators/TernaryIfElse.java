package chapter3_operators;

public class TernaryIfElse {
    static int ternarny(int i) {
        return i < 10 ? i * 100 : i * 10;
    }

    static int standardIfElse(int i) {
        if (i < 10)
            return i * 100;
        else
            return i * 10;
    }

    public static void main(String[] args) {
        System.out.println(ternarny(9));
        System.out.println(ternarny(10));
        System.out.println(standardIfElse(9));
        System.out.println(standardIfElse(10));
    }
}
