package chapter5_initializationAndTermination;

public class Flower {
    int petalCount = 0;
    String s = "initial value";
    Flower(int petals) {
        petalCount = petals;
        System.out.println("Конструктор с параметром int, petalCount= " + petalCount);
    }

    Flower(String ss) {
        System.out.println("Конструктор с параметром String, s = " + ss);
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals);
        this.s = s;
        System.out.println("Аргументы String и int");
    }

    Flower() {
        this("hi", 47);
        System.out.println("конструктор по умолчанию (без аргументов)");
    }

    void printPetalCount() {
        // this(11); // разрешается только в конструкторах
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
