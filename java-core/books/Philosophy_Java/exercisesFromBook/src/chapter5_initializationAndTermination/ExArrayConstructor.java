package chapter5_initializationAndTermination;

class B {
    B(String s) {
        System.out.println("s = " + s);
    }

    public B() {
        System.out.println("Пустой конструктор вызван");
    }
}

public class ExArrayConstructor {
    public static void main(String[] args) {
        B[] b = new B[2];

        B[] b1 = new B[2];
        b1[0] = new B("First");
        b1[1] = new B("Second");
        b[0] = new B();
    }
}
