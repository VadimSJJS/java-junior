package array_2;

/*
Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
 */

public class has12 {
    public static void main(String[] args) {
        System.out.println(has12(new int[] {1, 3, 2}));
        System.out.println(has12(new int[] {3, 1, 2}));
        System.out.println(has12(new int[] {3, 1, 4, 5, 2}));
    }

    public static boolean has12(int[] nums) {
        boolean isOne = false;
        int positionOne = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                isOne = true;
                positionOne = i;
            }

            if (nums[i] == 2 && positionOne < i) {
                return true;
            }
        }

        return false;
    }
}
