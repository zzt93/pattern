package ocp.visitor;

/**
 * Created by zzt on 3/19/16.
 * <p>
 * Usage:
 */
public class SumVisitor implements Visitor {

    private int sum;

    public int getSum() {
        return sum;
    }

    @Override
    public void visitNil(Nil nil) {
    }

    @Override
    public void visitIntList(IntList intList) {
        sum = intList.integers.stream().mapToInt(Integer::new).sum();
    }
}
