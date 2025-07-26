package logic_1;

/*
Given a string str, if the string starts with "f" return "Fizz".
If the string ends with "b" return "Buzz". If both the "f" and
"b" conditions are true, return "FizzBuzz". In all other cases,
return the string unchanged. (See also: FizzBuzz Code)

fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
 */

public class fizzString {
    public static void main(String[] args) {
        System.out.println(fizzString("fig"));
        System.out.println(fizzString("dib"));
        System.out.println(fizzString("fib"));
    }

    public static String fizzString(String str) {
        boolean isStartF = str.startsWith("f");
        boolean isEndB = str.endsWith("b");


        if (isStartF && isEndB) {
            return "FizzBuzz";
        } else if (isStartF) {
            return "Fizz";
        } else if (isEndB) {
            return "Buzz";
        }

        return str;
    }
}
