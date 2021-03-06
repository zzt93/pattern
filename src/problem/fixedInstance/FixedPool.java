package problem.fixedInstance;

/**
 * Created by zzt on 3/24/16.
 * <p>
 * Usage:
 */
public interface FixedPool<T> {
    T checkOut() throws InterruptedException;
    void checkIn(T t);
}
