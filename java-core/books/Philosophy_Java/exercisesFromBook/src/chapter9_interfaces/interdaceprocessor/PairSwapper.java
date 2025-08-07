package chapter9_interfaces.interdaceprocessor;

public class PairSwapper {
    public String swapPairs(String str) {
        String twoChars = "";
        char[] chars = str.toCharArray();

        for (int i = 0; i < str.length() - 1; i += 2) {
            char temp = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;

        }

        return new String(chars);
    }
}
