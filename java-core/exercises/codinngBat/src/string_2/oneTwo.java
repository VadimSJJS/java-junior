package string_2;

/*
Given a string, compute a new string by moving the first char to come after the next two chars,
so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd".
Ignore any group of fewer than 3 chars at the end.

oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"
 */

public class oneTwo {
    public static void main(String[] args) {
        System.out.println(oneTwo("abc"));
        System.out.println(oneTwo("tca"));
        System.out.println(oneTwo("tcagdo"));
    }

    public static String oneTwo(String str) {
        if (str.length() < 3) {
            return "";
        }

        String result = "";
        for (int i = 0; i < str.length() - 2; i += 3) {
            String subStr = str.substring(i + 1, i + 3) + str.substring(i, i + 1);
            result += subStr;
        }

        return result;
    }
}
