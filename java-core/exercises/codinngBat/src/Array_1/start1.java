package Array_1;

/*
Start with 2 int arrays, a and b, of any length.
Return how many of the arrays have 1 as their first element.

start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1
 */

public class start1 {
    public static void main(String[] args) {
        System.out.println(start1(new int[] {1, 2, 3}, new int[] {1, 3}));
        System.out.println(start1(new int[] {7, 2, 3}, new int[] {1}));
        System.out.println(start1(new int[] {1, 2}, new int[] {}));
    }

    public static int start1(int[] a, int[] b) {
        int count = 0;
        for  (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                count++;
            }
        }

        for  (int i = 0; i < b.length; i++) {
            if (b[i] == 1) {
                count++;
            }
        }

        return count;
    }
}
