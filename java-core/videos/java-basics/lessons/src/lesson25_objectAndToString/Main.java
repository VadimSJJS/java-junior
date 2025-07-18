package lesson25_objectAndToString;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Bob", 40);
        // объект сам вызывает метод toString()
        // который переопределен в класс Human
        System.out.println(h1);
    }
}

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ", " + age;
    }
}