package ocp.visitor;

/**
 * Created by zzt on 3/19/16.
 * <p>
 * Usage:
 */
public interface AList {

    void doSomething();
    // for adding new behaviour
    void visit(Visitor visitor);
}
