package variance.strategy;

/**
 * Created by zzt on 3/18/16.
 * <p>
 * Usage:
 */
public class Context {

    Algo algo;

    public Context(Algo algo) {
        this.algo = algo;
    }

    public double getResult() {
        return algo.compute();
    }
}
