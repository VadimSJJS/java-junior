package chapter11_collections;

import chapter14_typeinfo.pets.Hamster;
import chapter14_typeinfo.pets.Pet;
import chapter14_typeinfo.pets.Pets;
import chapter14_typeinfo.pets.Rat;

import java.util.LinkedList;

public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<Pet>(Pets.arrayList(5));
        System.out.println(pets);

        // Идентично
        System.out.println("pets.getFirst(): " + pets.getFirst());
        System.out.println("pets.element(): " + pets.element());

        // Отличается только поведение для пустого списка
        System.out.println("pets.seek(): " + pets.peek());

        // Идентично; удаление и возращение певрого элемента
        System.out.println("pets.remove(): " + pets.remove());
        System.out.println("pets.removeFirst(): " + pets.removeFirst());

        // Отличается только поведение для пустого списка
        System.out.println("pets.poll(): " + pets.poll());
        System.out.println(pets);

        pets.addFirst(new Rat());
        System.out.println("После addFirst(): " + pets);

        pets.offer(Pets.randomPet());
        System.out.println("После offer(): " + pets);

        pets.add(Pets.randomPet());
        System.out.println("После add(): " + pets);

        pets.addLast(new Hamster());
        System.out.println("После addLast(): " + pets);
        System.out.println("pets.removeLast(): " + pets.removeLast());
    }
}
