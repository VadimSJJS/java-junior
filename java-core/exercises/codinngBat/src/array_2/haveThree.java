package array_2;

/*
Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
 */

public class haveThree {
    public static void main(String[] args) {
        System.out.println(haveThree(new int[] {3, 1, 3, 1, 3}));
        System.out.println(haveThree(new int[] {3, 1, 3, 3}));
        System.out.println(haveThree(new int[] {3, 4, 3, 3, 4}));
    }

    public static boolean haveThree(int[] nums) {
        int countThree = 0;
        boolean isNear = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                countThree++;

                if (i < nums.length - 1 && nums[i + 1] == 3) {
                    isNear = true;
                }
            }


        }

        return countThree == 3 && !isNear;
    }
}
