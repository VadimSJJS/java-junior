package array_2;

/*
Given an array of ints, return true if it contains no 1's or it contains no 4's.

no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
 */

public class no14 {
    public static void main(String[] args) {
    }

    public static boolean no14(int[] nums) {
        boolean is1 = false;
        boolean is4 = false;
        for (int num : nums) {
            if (num == 1) {
                is1 = true;
            }

            if (num == 4) {
                is4 = true;
            }
        }

        return !is1 || !is4;
    }
}
