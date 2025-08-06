package chapter8_polymorphism;

public class PrivateOverride {
    public void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
        System.out.println(po.getClass());
        po = new PrivateOverride();
        System.out.println(po.getClass());
    }
}

class Derived extends PrivateOverride {
    public void f() {
        System.out.println("public f()");
    }
}