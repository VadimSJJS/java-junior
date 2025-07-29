package chapter5_initializationAndTermination;

public class ExOverloadingContructor {
    public ExOverloadingContructor() {
        this(1);
        System.out.println("First contructor");
    }

    public ExOverloadingContructor(int id) {
        System.out.println("Second contructor");
    }

    public static void main(String[] args) {
        ExOverloadingContructor x = new ExOverloadingContructor();
    }
}
