package lesson34_generics;

import lesson30_polymorphism.Animal;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Было до Java 5 //
        List animals = new ArrayList();
        Animal2 ourAnimal = new Animal2();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(3);
        System.out.println(animal);

        // Generics после Java 5 //
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
        // animals2.add(ourAnimal); // idea выдаст ошибку

        // Не используем downcasting
        String animal2 = animals2.get(1);


        // Java 7 //
        // Не неадо указывать справо тип String
        List<String> animals3 = new ArrayList<>();
    }
}

class Animal2 {

}