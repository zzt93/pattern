package ocp.visitor;

/**
 * Created by zzt on 3/19/16.
 * <p>
 * Usage:
 */
public class Nil implements AList {
    @Override
    public void doSomething() {

    }

    @Override
    public void visit(Visitor visitor) {
        visitor.visitNil(this);
    }
}
