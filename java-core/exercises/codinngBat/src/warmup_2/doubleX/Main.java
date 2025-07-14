package warmup_2.doubleX;

/*
Given a string, return true if the first instance
of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
        System.out.println(doubleX("xaxxx"));
    }

    public static boolean doubleX(String str) {
        int firstX = str.indexOf('x');

        if (firstX == -1 || firstX == str.length()-1) {
            return false;
        }
        return str.charAt(firstX+1) == 'x';
    }
}
