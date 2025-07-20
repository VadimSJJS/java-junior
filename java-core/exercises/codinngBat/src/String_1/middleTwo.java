package String_1;

/*
Given a string of even length, return a string made of the
middle two chars, so the string "string" yields "ri". The
string length will be at least 2.

middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
 */

public class middleTwo {
    public static void main(String[] args) {
        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("Practice"));
        System.out.println(middleTwo("ab"));
    }

    public static String middleTwo(String str) {

        int middle = str.length() / 2 - 1;
        return str.substring(middle, middle + 2);
    }
}
