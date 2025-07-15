package lesson20to21_constructor_static;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Bob", 40);
        Human h2 = new Human("Tom", 30);
        Human.description = "Nice";
        h1.getAllFields();
        h2.getAllFields();
        Human.description = "Bad";
        h1.getAllFields();
        h2.getAllFields();
        Human.printNumberPeople();

        System.out.println(Math.PI); // пример исопльзования static
    }
}

class Human {
    private String name;
    private int age;
    private static int countPeople;

    public static String description;

    //    public Human() {
//        System.out.println("Привет из первого конструктора");
//        this.name = "Имя по умолчанию";
//        this.age = 0;
//    }
//
//    public Human(String name) {
//        System.out.println("Привет из второго конструктора");
//        this.name = name;
//    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showInfo() {
        System.out.println(name + ", " + age);
    }

    public static void getDescription() {
        System.out.println(description);
    }

    public void getAllFields() {
        System.out.println(name + ", " + age + ", " + description);
    }

    public static void printNumberPeople() {
        System.out.println("Количество людей: " + countPeople);
    }
}