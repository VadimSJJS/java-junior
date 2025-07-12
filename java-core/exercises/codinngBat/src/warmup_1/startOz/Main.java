package warmup_1.startOz;

/*
Given a string, return a string made of the first 2
chars (if present), however include first char only if it
is 'o' and include the second only if it is 'z',
so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));
    }

    public static String startOz(String str) {
        String result = "";
        if (str.startsWith("o")) {
            result += "o";
        }
        if (str.startsWith("z", 1)) {
            result += "z";
        }

        return result;
    }
}
