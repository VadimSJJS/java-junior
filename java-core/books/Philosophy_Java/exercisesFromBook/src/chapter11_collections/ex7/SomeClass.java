package chapter11_collections.ex7;

/*
(7) Создайте класс, затем создайте инициализированный массив объектов этого класса. Заполните контейнер List данными массива.
Создайте подмножество List методом subList(), после чего удалите это подмножество из вашего контейнера List.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SomeClass {
    public static void main(String[] args) {
        Integer[] someClasses = new Integer[10];
        for (int i = 0; i < 10; i++) {
            someClasses[i] = i;
        }
        System.out.println("someClasses: " + Arrays.toString(someClasses));

        List<Integer> list = new ArrayList<>(Arrays.asList(someClasses));
        System.out.println("list: " + list);
        List<Integer> subList = list.subList(3, 7);
        System.out.println("sublist: " + subList);
        list.removeAll(subList);
        System.out.println("list: " + list);
    }
}
