package String_1;

/*
Given a string, return a version without the first 2 chars.
Except keep the first char if it is 'a' and keep the second
char if it is 'b'. The string may be any length. Harder than
it looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
 */

public class deFront {
    public static void main(String[] args) {
        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));
        System.out.println(deFront("abc"));
    }

    public static String deFront(String str) {
        if (str.isEmpty()) {
            return "";
        }

        String result = "";
        if (str.charAt(0) == 'a') {
            result += str.charAt(0);
        } if (str.charAt(1) == 'b') {
            result += str.charAt(1);
        }

        result += str.substring(2);

        return result;
    }
}
