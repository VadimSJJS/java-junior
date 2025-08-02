package chapter7_reusingclasses;

class SmallBrain {}

final class Dinosaur {
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();
    void f() {}
}

/*
class Jurassic extends Dinosaur {}
нельзя расширять, так как Dinosaur это
неизменный класс с final
 */

public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }
}
