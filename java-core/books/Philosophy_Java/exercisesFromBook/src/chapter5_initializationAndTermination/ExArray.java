package chapter5_initializationAndTermination;

public class ExArray {
    public static void main(String[] args) {
        String[] strings = new String[5];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = String.valueOf(i);
            System.out.println(strings[i]);
        }
    }
}
