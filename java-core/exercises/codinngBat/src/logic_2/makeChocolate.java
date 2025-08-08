package logic_2;

/*
We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.

makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2
 */

public class makeChocolate {
    public static void main(String[] args) {
        System.out.println(makeChocolate(4, 1, 9));
        System.out.println(makeChocolate(4, 1, 10));
        System.out.println(makeChocolate(4, 1, 7));
        System.out.println(makeChocolate(6, 2, 7));
        System.out.println(makeChocolate(5, 4, 9));

    }

    public static int makeChocolate(int small, int big, int goal) {
        int maxBigInUse = goal / 5;
        int usedBig = Math.min(big, maxBigInUse);

        int remainForSmall = goal - (usedBig * 5);
        if (small >= remainForSmall) {
            return remainForSmall;
        }

        return -1;
    }
}
