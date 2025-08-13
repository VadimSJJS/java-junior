package chapter11_collections.ex4;

/*
(3) Создайте класс-генератор, который при каждом вызове next() выдает имена персонажей вашего любимого фильма в виде объектов String.
Когда список заканчивается, программа снова возвращается к началу. Используйте генератор для заполнения массива и контейнеров
ArrayList, LinkedList, HashSet, LinkedHashSet и TreeSet, после чего выведите содержимое каждого контейнера.
 */

import java.util.*;

public class CharacterGenerator {
    private List<String> characters;
    private int currentIndex;

    public CharacterGenerator(String... names) {
        characters = new ArrayList<>(Arrays.asList(names));
        this.currentIndex = 0;
    }


    public String next() {
        if (currentIndex >= characters.size()) {
            currentIndex = 0;
        }

        return characters.get(currentIndex++);
    }

    public static void main(String[] args) {
        CharacterGenerator generator = new CharacterGenerator(
                "Тони Старк", "Капитан Америка", "Черная Вдова",
                "Халк", "Тор", "Соколиный Глаз"
        );

        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = generator.next();
        }

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        for (int i = 0; i < 10; i++) {
            String character = generator.next();
            arrayList.add(character);
            linkedList.add(character);
            hashSet.add(character);
            linkedHashSet.add(character);
            treeSet.add(character);
        }

        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
