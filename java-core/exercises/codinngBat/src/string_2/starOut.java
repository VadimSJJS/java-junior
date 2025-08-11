package string_2;

/*
Return a version of the given string, where for every star (*) in the string the star and the chars
immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
 */

public class starOut {
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd"));
        System.out.println(starOut("ab**cd"));
        System.out.println(starOut("sm*eilly"));
    }

    public static String starOut(String str) {
        String result = "";

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i + 1) == '*')
                continue;
            }

            result += str.substring(i, i + 1);
        }

        return result;
    }
}
