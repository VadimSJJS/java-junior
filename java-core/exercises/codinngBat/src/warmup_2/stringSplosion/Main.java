package warmup_2.stringSplosion;

/*
Given a non-empty string like "Code" return a s
tring like "CCoCodCode".

stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));
    }

    public static String stringSplosion(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result += str.substring(0, i + 1);
        }

        return result;
    }
}
