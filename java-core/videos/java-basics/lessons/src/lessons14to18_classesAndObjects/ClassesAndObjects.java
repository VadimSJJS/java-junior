package lessons14to18_classesAndObjects;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("asd");
        person1.setAge(12);
        System.out.println("Выводит значение в main методе: " + person1.getName());
        System.out.println("Выводит значение в main методе: " + person1.getAge());
        person1.speak();
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String username) {
        if (username.isEmpty()) {
            System.out.println("Ты ввел пустое имя");
        } else {
            name = username;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Возраст должен быть положительный");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
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