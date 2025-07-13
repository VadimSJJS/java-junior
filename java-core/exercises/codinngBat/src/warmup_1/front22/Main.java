package warmup_1.front22;

/*
Given a string, take the first 2 chars and return the
string with the 2 chars added at both the front and
back, so "kitten" yields"kikittenki". If the string
length is less than 2, use whatever chars are there.

front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(front22("kitten"));
        System.out.println(front22("Ha"));
        System.out.println(front22("abc"));
    }

    public static String front22(String str) {
        if (str.isEmpty() || str.length() == 1 ) {
            return str + str + str;
        }

        String firstChars = str.substring(0, 2);

        return firstChars + str + firstChars;
    }
}
