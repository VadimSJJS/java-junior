package logic_2;

/*
We want to make a row of bricks that is goal inches long. We have a number of small bricks
(1 inch each) and big bricks (5 inches each). Return true if it is possible to make the
goal by choosing from the given bricks. This is a little harder than it looks and can
be done without any loops. See also: Introduction to MakeBricks

makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true
 */
public class makeBricks {
    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));
        System.out.println(makeBricks(3, 1, 9));
        System.out.println(makeBricks(3, 2, 10));
        System.out.println(makeBricks(6, 1, 11));
    }

    /*
    13 and 3 => 2 (2 * 5 = 10 < 13)
    15 and 3 => 3
     */

    public static boolean makeBricks(int small, int big, int goal) {
        int maxBigInUse = Math.min(big, goal / 5);
        int remainingLength = goal - maxBigInUse * 5;
        return small >= remainingLength;
    }
}
