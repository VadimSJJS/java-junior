package String_1;

/*
Given a string, if the first or last chars are 'x', return
the string without those 'x' chars, and otherwise return
the string unchanged.

withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
 */

public class withoutX {
    public static void main(String[] args) {
        System.out.println(withoutX("xHix"));
        System.out.println(withoutX("xHi"));
        System.out.println(withoutX("Hxix"));
        System.out.println(withoutX("x"));
    }

    public static String withoutX(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.charAt(0) == 'x' && str.length() != 1) {
            str = str.substring(1);
        }
        if (str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }
}
