package chapter11_collections.ex11;

import java.util.*;

public class SomeClass {
    public static void printCollection(Collection collection) {
        Iterator iterator = collection.iterator();

        while(iterator.hasNext()) {
            Object element = iterator.next();
            System.out.print(element.toString() + ", ");
        }
        System.out.println("\n------------------------------------------");
    }
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(Arrays.asList(
                "Apple", "Banana", "Cherry"
        ));

        Set<Integer> hashSet = new HashSet<Integer>(Arrays.asList(1, 2, 3));

        printCollection(arrayList);
        printCollection(hashSet);
    }
}
