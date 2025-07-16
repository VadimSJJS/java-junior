package chapter3_operators;

/*
Напишите метод, который получает два аргумента String,
выполняет с ними
 */

public class ExStringOperations {
    public static void main(String[] args) {
        // Сравнение различных объектов String
        compareStrings("hello", "hello");  // Два одинаковых литерала (могут быть одним объектом)
        compareStrings("hello", new String("hello"));  // Литерал и новый объект
        compareStrings("hello", "world");  // Два разных литерала
        compareStrings(new String("hello"), new String("hello"));  // Два разных объекта с одинаковым содержимым

        String s1 = "hello";
        String s2 = s1;
        compareStrings(s1, s2);
    }

    static void compareStrings(String str1, String str2) {
        System.out.println("Результаты сравнения для \"" + str1 + "\" и \"" + str2 + "\":");
        System.out.println("== : " + (str1 == str2));
        System.out.println("!= : " + (str1 != str2));
        System.out.println("equals(): " + str1.equals(str2));
        System.out.println();
    }
}
