package chapter9_interfaces.interdaceprocessor;

public class Main {
    public static void main(String[] args) {
        String str = "123456";
        PairSwapper pairSwapper = new PairSwapper();
        Processor processor = new PairSwapperAdapter(pairSwapper);

        Apply.process(processor, str);
    }
}
