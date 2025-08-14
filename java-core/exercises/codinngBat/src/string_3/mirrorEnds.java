package string_3;

/*
Given a string, look for a mirror image (backwards) string at both the beginning and end
of the given string. In other words, zero or more characters at the very begining of the given string,
and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
 */

public class mirrorEnds {
    public static void main(String[] args) {
        System.out.println(mirrorEnds("abXYZba"));
        System.out.println(mirrorEnds("abca"));
        System.out.println(mirrorEnds("aba"));
    }

    public static String mirrorEnds(String string) {
        boolean isPalindrom;
        String reverseString = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString += string.charAt(i);
        }

        isPalindrom = string.equals(reverseString);

        if (isPalindrom) {
            return string;
        }

        for (int i = string.length() / 2; i > 0; i--) {
            if (string.substring(0, i).equals(reverseString.substring(0, i))) {
                return string.substring(0, i);
            }
        }

        return "";
    }
}
