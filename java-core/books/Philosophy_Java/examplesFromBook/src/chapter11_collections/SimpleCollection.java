package chapter11_collections;

import java.util.ArrayList;
import java.util.Collection;

/*
(2) Измените пример SimpleCollection.java так, чтобы в качестве контейнера использовалось множество (Set)
 */

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            c.add(i); // Автоматическая упаковка
        for (Integer i : c) {
            System.out.print(i + " ");
        }
    }
}
