package logic_1;

/*
Given an int n, return the string form of the number followed
by "!". So the int 6 yields "6!". Except if the number is divisible
by 3 use "Fizz" instead of the number, and if the number is
divisible by 5 use "Buzz", and if divisible by both 3 and 5,
use "FizzBuzz". Note: the % "mod" operator computes the remainder
after division, so 23 % 10 yields 3.

fizzString2(1) → "1!"
fizzString2(2) → "2!"
fizzString2(3) → "Fizz!"
 */

public class fizzString2 {
    public static void main(String[] args) {
        System.out.println(fizzString2(1));
        System.out.println(fizzString2(2));
        System.out.println(fizzString2(3));
    }

    public static String fizzString2(int n) {
        boolean isDivide3 = n % 3 == 0;
        boolean isDivide5 = n % 5 == 0;

        if (isDivide3 && isDivide5) {
            return "FizzBuzz!";
        } else if (isDivide3) {
            return "Fizz!";
        } else if (isDivide5) {
            return "Buzz!";
        }

        return n + "!";
    }
}
