package logic_1;

/*
Given two ints, each in the range 10..99, return true if there
is a digit that appears in both numbers, such as the 2 in 12
and 23. (Note: division, e.g. n/10, gives the left digit
while the % "mod" n%10 gives the right digit.)

shareDigit(12, 23) → true
shareDigit(12, 43) → false
shareDigit(12, 44) → false
 */

public class shareDigit {
    public static void main(String[] args) {
        System.out.println(shareDigit(12, 23));
        System.out.println(shareDigit(12, 43));
        System.out.println(shareDigit(12, 44));
    }

    public static boolean shareDigit(int a, int b ) {
        int divBy10A = a / 10;
        int divBy10B = b / 10;
        int remainderBy10A = a % 10;
        int remainderBy10B = b % 10;

        return divBy10A == divBy10B ||
                divBy10A == remainderBy10B ||
                remainderBy10A == divBy10B ||
                remainderBy10A == remainderBy10B;
    }
}
