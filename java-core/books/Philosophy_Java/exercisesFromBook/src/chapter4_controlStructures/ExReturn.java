package chapter4_controlStructures;

/*
Измените метод test() так, чтобы он получал два
дополнительных аргумента begin и end, а значение
testval проверялось на принадлежность к диапазону
[begin, end] (с включением границ)
 */

public class ExReturn {
    static int test(int testval, int begin, int end) {
        if (testval >= begin  && testval <= end)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(test(20, 10, 21));
        System.out.println(test(20, 1, 15));
        System.out.println(test(20, 10, 19));
    }
}
