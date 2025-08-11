package string_2;

/*
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
 */

public class zipZap {
    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap"));
        System.out.println(zipZap("zopzop"));
        System.out.println(zipZap("zzzopzop"));
    }

    public static String zipZap(String str) {
        if (str.length() < 3) {
            return str;
        }

        String result = str.substring(0, 1);

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i - 1) == 'z' && str.charAt(i + 1) == 'p') {
                continue;
            }

            result += str.substring(i, i + 1);
        }

        return result + str.substring(str.length() - 1);
    }
}
