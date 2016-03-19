package ocp.visitor;

/**
 * Created by zzt on 3/19/16.
 * <p>
 * Usage:
 */
public class Tester {
    public static void main(String[] args) {
        IntList intList = new IntList();
        intList.doSomething();
        SumVisitor visitor = new SumVisitor();
        intList.visit(visitor);
        System.out.println(visitor.getSum());
    }
}
