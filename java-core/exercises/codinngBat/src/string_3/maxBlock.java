package string_3;

/*
Given a string, return the length of the largest "block" in the string.
A block is a run of adjacent chars that are the same.

maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
 */

public class maxBlock {
    public static void main(String[] args) {
        System.out.println(maxBlock("hoopla"));
        System.out.println(maxBlock("abbCCCddBBBxx"));
        System.out.println(maxBlock(""));
        System.out.println(maxBlock("xyzz"));
        System.out.println(maxBlock("XXBBBbbxxXXXX"));
    }

    public static int maxBlock(String str) {
        int count = 0;
        int max = 0;

        if (str.isEmpty()) {
            return 0;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }

        if (count > max) {
            return ++count;
        }

        return max + 1;
    }
}
