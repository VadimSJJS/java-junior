package warmup_2.last2;

/*
Given a string, return the count of the number of
times that a substring length 2 appears in the
string and also as the last 2 chars of the string,
so "hixxxhi" yields 1 (we won't count the end substring).

last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(last2("hixxhi"));
        System.out.println(last2("xaxxaxaxx"));
        System.out.println(last2("axxxaaxx"));
        System.out.println(last2("xxaxxaxxaxx"));
        System.out.println(last2("xxxx"));
    }

    public static int last2(String str) {
        if (str.length() <= 1) {
            return 0;
        }

        int count = 0;
        String lastStr = str.substring(str.length() - 2);

        for (int i = 0; i < str.length() - 2; i++) {
            if (lastStr.equals(str.substring(i, i + 2))) {
                count++;
            }
        }

        return count;
    }
}
