package lesson35_wildcardsGenerics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal2> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal2(1));
        listOfAnimals.add(new Animal2(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimals);
        test(listOfDogs);

        /*
        Object
        Animal
        Dog
         */
    }


    private static void test(List<? extends Animal2> list) {

        for (Animal2 animal : list) {
            animal.eat();
        }
    }
}

