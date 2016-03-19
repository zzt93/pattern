package ocp.visitor;

/**
 * Created by zzt on 3/19/16.
 * <p>
 * Usage:
 */
public interface Visitor {

    void visitNil(Nil nil);
    void visitIntList(IntList intList);

}
