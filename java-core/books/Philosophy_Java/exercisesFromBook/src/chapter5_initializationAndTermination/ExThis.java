package chapter5_initializationAndTermination;

public class ExThis {
    public void method1() {
        method2();
        this.method2();
    }

    public void method2() {
        System.out.println("method2 called");
    }

    public static void main(String[] args) {
        ExThis exThis = new ExThis();
        exThis.method1();
    }
}
