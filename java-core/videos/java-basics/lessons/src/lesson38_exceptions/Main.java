package lesson38_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("asd");
        Scanner scanner = new Scanner(file);
    }
}
