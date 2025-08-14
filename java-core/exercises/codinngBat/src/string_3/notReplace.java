package string_3;

/*
Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count.
(Note: Character.isLetter(char) tests if a char is a letter.)

notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"
 */

public class notReplace {
    public static void main(String[] args) {
        System.out.println(notReplace("is test"));
        System.out.println(notReplace("is-is"));
        System.out.println(notReplace("This is right"));
        int i = 2;
        System.out.println("is".substring(i - 2, i));
    }

    public static String notReplace(String str) {
        String result = "";
        int n = str.length();

        for (int i = 0; i < n; i++) {
            if (i + 1 < n && str.startsWith("is", i)) {
                boolean isWord = true;

                if (i > 0 && Character.isLetter(str.charAt(i - 1))) {
                    isWord = false;
                }

                if (i + 2 < n && Character.isLetter(str.charAt(i + 2))) {
                    isWord = false;
                }

                if (isWord) {
                    result += "is not";
                    i++;
                } else {
                    result += str.charAt(i);
                }
            } else {
                result += str.charAt(i);
            }
        }

        return result;
    }
}
