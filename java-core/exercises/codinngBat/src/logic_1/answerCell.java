package logic_1;

public class answerCell {
    public static void main(String[] args) {
        System.out.println(answerCell(false, false, false));
        System.out.println(answerCell(false, false, true));
        System.out.println(answerCell(true, false, false));
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return !isAsleep && (!isMorning || isMom);
    }
}
