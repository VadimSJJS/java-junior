package chapter11_collections.ex1;

/*
(1) Создайте новый класс с именем Gerbil с полем gerbilNumber типа int, инициализируемым в конструкторе. Определите в нем метод hop(),
который выводит значение gerbilNumber и короткое сообщение. Создайте контейнер ArrayList и добавьте в него объекты Gerbil.
Используйте метод get() для перебора элементов и вызова hop() для каждого объекта Gerbil.
 */

import java.util.ArrayList;

public class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("gerbilNumber = " + gerbilNumber);
        System.out.println("It's a short message");
    }

    public static void main(String[] args) {
        Gerbil gerbil1 = new Gerbil(1);
        Gerbil gerbil2 = new Gerbil(2);
        Gerbil gerbil3 = new Gerbil(3);

        ArrayList<Gerbil> gerbils = new ArrayList<>();
        gerbils.add(gerbil1);
        gerbils.add(gerbil2);
        gerbils.add(gerbil3);

        for (int i = 0; i < gerbils.size(); i++) {
            gerbils.get(i).hop();
        }
    }
}
