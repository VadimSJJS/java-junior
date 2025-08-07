package chapter9_interfaces.interdaceprocessor;

public class PairSwapperAdapter implements Processor {

    private PairSwapper pairSwapper;

    public PairSwapperAdapter(PairSwapper pairSwapper) {
        this.pairSwapper = pairSwapper;
    }

    @Override
    public String name() {
        return "PairSwapper";
    }

    @Override
    public Object process(Object input) {
        return pairSwapper.swapPairs((String)input);
    }
}
