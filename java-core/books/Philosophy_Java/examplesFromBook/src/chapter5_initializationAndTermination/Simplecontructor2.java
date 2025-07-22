package chapter5_initializationAndTermination;

class Rock2 {
    Rock2(int i) {
        System.out.println("Rock2: " + i + " ");
    }
}

public class Simplecontructor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            new Rock2(i);
        }
    }
}
