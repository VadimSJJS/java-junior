package logic_1;

/*
You have a blue lottery ticket, with ints a, b, and c on it.
This makes three pairs, which we'll call ab, bc, and ac.
Consider the sum of the numbers in each pair.
If any pair sums to exactly 10, the result is 10.
Otherwise if the ab sum is exactly 10 more than either bc or
ac sums, the result is 5. Otherwise the result is 0.

blueTicket(9, 1, 0) → 10
blueTicket(9, 2, 0) → 0
blueTicket(6, 1, 4) → 10
 */

public class blueTicket {
    public static void main(String[] args) {
        System.out.println(blueTicket(9, 1, 0));
        System.out.println(blueTicket(9, 2, 0));
        System.out.println(blueTicket(6, 1, 4));
    }

    public static int blueTicket(int a, int b, int c) {
        boolean isSumAB10 = a + b == 10;
        boolean isSumAC10 = a + c == 10;
        boolean isSumBC10 = b + c == 10;

        int sumAB = a + b;
        int sumAC10 = a + c;
        int sumBC10 = b + c;

        if (isSumAB10 || isSumAC10 || isSumBC10) {
            return 10;
        } else if (sumAB - 10 >= sumAC10 || sumAB - 10 >= sumBC10) {
            return 5;
        }

        return 0;
    }
}
