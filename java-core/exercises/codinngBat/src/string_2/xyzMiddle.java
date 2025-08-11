package string_2;

/*
Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of
chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
 */

public class xyzMiddle {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
        System.out.println(xyzMiddle("xyzAxyzBBB"));
    }

    public static boolean xyzMiddle(String str) {
        if (str.equals("xyz")) {
            return true;
        }

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                String firstStr = str.substring(0, i);
                String lastStr = str.substring(i + 3);

                if (Math.abs(firstStr.length() - lastStr.length()) <= 1) {
                    return true;
                }
            }
        }

        return false;
    }
}
