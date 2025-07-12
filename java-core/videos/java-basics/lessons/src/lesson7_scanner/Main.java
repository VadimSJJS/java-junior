package lesson7_scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("введите что-нибудь: ");
        int x = s.nextInt();
        System.out.println("Вы ввели " + x);
    }
}
