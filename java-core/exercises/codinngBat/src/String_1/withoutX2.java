package String_1;

/*
Given a string, if one or both of the first 2 chars is 'x',
return the string without those 'x' chars, and otherwise
return the string unchanged. This is a little harder than
it looks.

withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
 */

public class withoutX2 {
    public static void main(String[] args) {
        System.out.println(withoutX2("xHi"));
        System.out.println(withoutX2("Hxi"));
        System.out.println(withoutX2("Hi"));
    }

    public static String withoutX2(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.length() == 1 && str.charAt(0) == 'x') {
            return "";
        }
        String result = "";
        if (str.charAt(0) != 'x') {
            result +=  str.charAt(0);
        }
        if (str.charAt(1) != 'x') {
            result += str.charAt(1);
        }

        result += str.substring(2);

        return result;
    }
}
