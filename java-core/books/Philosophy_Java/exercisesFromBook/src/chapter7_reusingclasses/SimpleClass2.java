package chapter7_reusingclasses;

public class SimpleClass2 {
    // ссылка на объект первого класса
    private SimpleClass1 simpleClass1;

    public String toString() {
        if (simpleClass1 == null) {
            simpleClass1 = new SimpleClass1();
        }

        return "simpleClass1 = " + simpleClass1;
    }

    public static void main(String[] args) {
        SimpleClass2 simpleClass2 = new SimpleClass2();
        System.out.println(simpleClass2);
        System.out.println(simpleClass2);
    }
}
