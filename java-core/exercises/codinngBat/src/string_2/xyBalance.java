package string_2;

/*
We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string.
So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
 */

public class xyBalance {
    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby"));
        System.out.println("aaxbby".lastIndexOf('x') + " " + "aaxbby".lastIndexOf('y'));
        System.out.println(xyBalance("aaxbb"));
        System.out.println(xyBalance("yaaxbb"));
    }

    public static boolean xyBalance(String str) {
        int positionX = str.lastIndexOf('x');
        int positionY = str.lastIndexOf('y');

        return positionY >= positionX;
    }
}
