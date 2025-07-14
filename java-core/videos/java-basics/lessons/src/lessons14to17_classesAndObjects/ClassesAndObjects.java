package lessons14to17_classesAndObjects;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Роман");
        person1.age = 50;
        person1.speak();

        Person person2 = new Person();
        person2.setName("Вова");
        person2.age = 20;
        person2.speak();
    }
}

class Person {
    String name;
    int age;

    void setName(String username) {
        name = username;
    }

    int calculateYearsRetirement() {
        int years = 65 - age;
//        System.out.println("Количество лет до пенсии: " + years);
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет.");
        }
    }

    void sayHello() {
        System.out.println("Привет!");
    }
}