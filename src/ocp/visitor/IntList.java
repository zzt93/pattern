package ocp.visitor;

import java.util.ArrayList;

/**
 * Created by zzt on 3/19/16.
 * <p>
 * Usage:
 */
public class IntList implements AList {

    ArrayList<Integer> integers = new ArrayList<>();

    @Override
    public void doSomething() {
        integers.add(1);
        integers.add(2);
        integers.add(3);
    }

    @Override
    public void visit(Visitor visitor) {
        visitor.visitIntList(this);
    }
}
