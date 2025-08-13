package chapter11_collections.ex14;

import java.util.LinkedList;
import java.util.ListIterator;

public class Ex14 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        ListIterator<Integer> listIterator = linkedList.listIterator(linkedList.size() / 2);

        for (int i = 1; i < 5; i++) {
            int value = i * 100;
            listIterator.add(value);
        }

        System.out.println(linkedList);
    }
}
