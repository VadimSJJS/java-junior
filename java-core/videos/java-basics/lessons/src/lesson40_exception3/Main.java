package lesson40_exception3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Checked Exception (Compile Time Exception)
        // Unchecked Exception (Runtime exception)

        int a = 1 / 0;

        String name = null;
        name.length();

        int[] arr = new int[2];
        System.out.println(arr[2]);
    }
}
