package chapter3_operators;

/* 5. Создайте класс Dog, содержащий два поля типа String:
name и says. В методе main() создайте два объекта Dog
с разными именами (spot и scruffy) и сообщениями.
Выведите значения обоих полей для каждого из объектов

6.  В упражнении 5 создайте новую ссылку на Dog и
присвойте ее объекту spot. Сравните ссылки оператором ==
и методом equals()
 */

class Dog {
    String name;
    String says;
}

public class ExEqualsMethod {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "spot";
        dog1.says = "Gav";
        dog2.name = "scruffy";
        dog2.says = "Wuh";

        System.out.println("dog1.name = " + dog1.name + ", dog1.says = " + dog1.says);
        System.out.println("dog2.name = " + dog2.name + ", dog2.says = " + dog2.says);

        Dog newDog = new Dog();
        newDog.name = "newDog";
        newDog.says = "newSays";
        dog1 = newDog;

        System.out.println("dog1.name = " + dog1.name + ", dog1.says = " + dog1.says);
        System.out.println("newDog.name = " + newDog.name + ", newDog.says = " + newDog.says);

        System.out.println("dog1.name == newDog.name: " + dog1.name == newDog.name);
        System.out.println("dog1.says == newDog.says: " + dog1.says == newDog.says);
        System.out.println("dog1.says.equals(newDog.says): " + dog1.says.equals(newDog.says));
        System.out.println("dog1.equals(newDog): " + dog1.equals(newDog));
    }
}
