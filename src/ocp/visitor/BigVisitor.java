package ocp.visitor;

import java.util.Comparator;

/**
 * Created by zzt on 3/20/16.
 * <p>
 * Usage:
 */
public class BigVisitor implements Visitor {
    private int big;

    public int getBig() {
        return big;
    }

    @Override
    public void visitNil(Nil nil) {
    }

    @Override
    public void visitIntList(IntList intList) {
        big = intList.integers.stream().max(Comparator.naturalOrder()).get();
    }
}
