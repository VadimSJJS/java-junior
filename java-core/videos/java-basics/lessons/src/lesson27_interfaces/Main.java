package lesson27_interfaces;

public class Main {
    public static void main(String[] args) {
        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");
        info1.showInfo();
        info2.showInfo();
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        animal1.showInfo();
        person1.showInfo();
        outputInfo(info1);
        outputInfo(info2);
        outputInfo(animal1);
        outputInfo(person1);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
