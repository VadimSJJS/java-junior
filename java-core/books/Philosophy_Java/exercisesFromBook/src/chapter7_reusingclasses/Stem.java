package chapter7_reusingclasses;

public class Stem extends Root {
    public Stem() {
        System.out.println("Stem()");
    }

    public static void main(String[] args) {
        Stem stem = new Stem();
    }
}
