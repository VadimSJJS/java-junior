package chapter11_collections.ex12;

/*
(12) Создайте и заполните контейнер List<Integer>. Создайте второй контейнер List<Integer> того же размера.
Используйте итератор ListIterator для чтения элементов из первого контейнера List и вставки их во второй контейнер в обратном порядке.
(Проанализируйте несколько различных способов решения этой задачи.)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Ex12 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        ListIterator<Integer> listIterator1 = list1.listIterator();
        ListIterator<Integer> listIterator2 = list2.listIterator();

        while(listIterator1.hasNext()) {
            list2.add(listIterator1.next());
        }

        System.out.println(list2);
    }
}
