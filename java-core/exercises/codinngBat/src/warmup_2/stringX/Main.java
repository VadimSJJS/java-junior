package warmup_2.stringX;

/*
Given a string, return a version where all the "x" have
been removed. Except an "x" at the very start or end
should not be removed.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
    }

    public static String stringX(String str) {
        if (str.length() < 2) {
            return str;
        }
        String result = str.substring(0, 1);

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                continue;
            }
            result += str.charAt(i);
        }

        return result+ str.substring(str.length() - 1);
    }
}
