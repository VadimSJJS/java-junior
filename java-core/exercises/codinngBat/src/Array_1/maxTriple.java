package Array_1;

/*
Given an array of ints of odd length, look at the first, last,
and middle values in the array and return the largest.
The array length will be a least 1.

maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
 */

public class maxTriple {
    public static void main(String[] args) {

    }

    public static int maxTriple(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int middleLength = nums.length / 2;
        int firstValue = nums[0];
        int middleValue = nums[middleLength];
        int lastValue = nums[nums.length - 1];
        int max = Math.max(firstValue, Math.max(middleValue, lastValue));

        return max;
    }
}
