package chapter11_collections.ex2;

import java.util.HashSet;
import java.util.Set;

/*
(2) Измените пример SimpleCollection.java так, чтобы в качестве контейнера использовалось множество (Set)
 */

public class SimpleCollection {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<Integer>();
        for (int i = 0; i < 10; i++)
            c.add(i); // Автоматическая упаковка
        for (Integer i : c) {
            System.out.print(i + " ");
        }
    }
}
