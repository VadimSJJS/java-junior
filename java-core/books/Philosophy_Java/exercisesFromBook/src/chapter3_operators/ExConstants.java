package chapter3_operators;

/*

 */

public class ExConstants {
    public static void main(String[] args) {
        final int CONST1 = 0x6A0;
        final int CONST2 = 0x0106B;
        System.out.println("CONST1 = " + Integer.toBinaryString(CONST1));
        System.out.println("CONST2 = " + Integer.toBinaryString(CONST2));
        System.out.println("CONST1 & CONST2 = " + Integer.toBinaryString(CONST1 & CONST2));
        System.out.println("CONST1 | CONST2 = " + Integer.toBinaryString(CONST1 | CONST2));
        System.out.println("CONST1 ^ CONST2 = " + Integer.toBinaryString(CONST1 ^ CONST2));
    }
}
