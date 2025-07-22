package chapter5_initializationAndTermination;

class Rock {
    Rock() { // Это и есть конструктор
        System.out.println("Rock ");
    }
}

public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            new Rock();
    }
}
