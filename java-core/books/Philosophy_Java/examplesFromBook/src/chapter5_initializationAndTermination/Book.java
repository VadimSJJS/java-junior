package chapter5_initializationAndTermination;

public class Book {
    boolean checkedOut = false;
    Book(boolean checkedOut) {
        checkedOut = checkedOut;
    }

    void checkIn() {
        checkedOut = false;
    }

//    public void finalize() {
//        if (checkedOut) {
//            System.out.println("Ошибка: checkedOut");
//            // Обычно это делается так:
//            // Super.finalize(); // Вызов версии базового класса
//        }
//    }

}

class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // Правильная чистка
        novel.checkIn();
        // Теряем ссылку, забыли про очистку:
        new Book(true);
        // Принудительная уборка мусора и финализация
        System.gc();
    }
}