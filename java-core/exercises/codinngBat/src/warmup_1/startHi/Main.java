package warmup_1.startHi;
/*
Given a string, return true if the string
starts with "hi" and false otherwise.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));
    }

    public static boolean startHi(String str) {
        return str.startsWith("hi");
    }
}
