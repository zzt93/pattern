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
        SumVisitor sum = new SumVisitor();
        intList.visit(sum);
        System.out.println(sum.getSum());
        BigVisitor big = new BigVisitor();
        intList.visit(big);
        System.out.println(big.getBig());
    }
}
