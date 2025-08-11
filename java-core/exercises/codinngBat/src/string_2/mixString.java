package string_2;

/*
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
 */

public class mixString {
    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));
    }

    public static String mixString(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();
        String result = "";

        if (lengthA < lengthB) {
            for (int i = 0; i < lengthA; i++) {
                result += a.substring(i, i + 1) + b.substring(i, i + 1);
            }

            return result + b.substring(lengthA);
        } else if (lengthA > lengthB) {
            for (int i = 0; i < lengthB; i++) {
                result += a.substring(i, i + 1) + b.substring(i, i + 1);
            }

            return result + a.substring(lengthB);
        }

        for (int i = 0; i < lengthA; i++) {
            result += a.substring(i, i + 1) + b.substring(i, i + 1);
        }

        return result;
    }
}
