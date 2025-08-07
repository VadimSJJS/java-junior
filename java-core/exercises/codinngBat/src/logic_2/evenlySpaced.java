package logic_2;

/*
Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced,
so the difference between small and medium is the same as the difference between medium and large.

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
 */

public class evenlySpaced {
    public static void main(String[] args) {
        System.out.println(evenlySpaced(2, 4, 6));
        System.out.println(evenlySpaced(4, 6, 2));
        System.out.println(evenlySpaced(4, 6, 3));
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c); // 6
        int min = Math.min(Math.min(a, b), c); // 2
        int medium;

        if (a != max && a != min) {
            medium = a;
        } else if (b != max && b != min) {
            medium = b;
        } else {
            medium = c;
        }

//        System.out.printf("max = %d, medium = %d, min = %d", max, medium, min);

        return medium - min == max - medium;
    }
}

// true: small - medium = large - medium
