package string_3;

/*
Given a string, return the longest substring that appears at both the beginning
and end of the string without overlapping. For example, sameEnds("abXab") is "ab".

sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
 */

public class sameEnds {
    public static void main(String[] args) {
        System.out.println(sameEnds("abXYab"));
        System.out.println(sameEnds("xx"));
        System.out.println(sameEnds("xxx"));
    }

    public static String sameEnds(String string) {
        if (string.length() == 1) {
            return "";
        }

        for (int i = string.length() / 2; i > 0; i--) {
            if (string.substring(0, i).equals(string.substring(string.length() - i))) {
                return string.substring(0, i);
            }
        }

        return "";
    }
}
