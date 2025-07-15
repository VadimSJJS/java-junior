package chapter3_operators;

// Создайте класс полем типа float. Используйте его для
// демонстрации совмещения имен
public class ExAssignment {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.countMoney = 42.2F;
        System.out.println("person1.countMoney=" + person1.countMoney + ", person2.countMoney=" + person2.countMoney);

        person2.countMoney = 11.1F;
        System.out.println("person1.countMoney=" + person1.countMoney + ", person2.countMoney=" + person2.countMoney);

        person1.countMoney = person2.countMoney;
        System.out.println("person1.countMoney=" + person1.countMoney + ", person2.countMoney=" + person2.countMoney);

        person2.countMoney = 33.3F; // значения будут разные потому что поля это примитивы
        System.out.println("person1.countMoney=" + person1.countMoney + ", person2.countMoney=" + person2.countMoney);

        person2 = person1;
        System.out.println("person1.countMoney=" + person1.countMoney + ", person2.countMoney=" + person2.countMoney);

        person1.countMoney = 42.2F; // значения будут одинаковые так как это ссылки
        System.out.println("person1.countMoney=" + person1.countMoney + ", person2.countMoney=" + person2.countMoney);

        person2.countMoney = 11.1F;
        System.out.println("person1.countMoney=" + person1.countMoney + ", person2.countMoney=" + person2.countMoney);
    }
}

class Person {
    float countMoney;
}
