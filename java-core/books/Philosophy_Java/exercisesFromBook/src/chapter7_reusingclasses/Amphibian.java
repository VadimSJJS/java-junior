package chapter7_reusingclasses;

public class Amphibian {
    public void jump() {
        System.out.println("Amphibian jump");
    }

    public void swim() {
        System.out.println("Amphibian swim");
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.jump();
        frog.swim();

        // восходящее преобразование
        Amphibian amphibian = frog;
        amphibian.jump();
        amphibian.swim();

        amphibian = new Amphibian();
        amphibian.jump();
        amphibian.swim();
    }
}

class Frog extends Amphibian {
    @Override
    public void jump() {
        System.out.println("Frog jump");
    }

    @Override
    public void swim() {
        System.out.println("Frog swim");
    }
}
