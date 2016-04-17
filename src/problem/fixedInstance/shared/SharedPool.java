package problem.fixedInstance.shared;

import problem.fixedInstance.FixedPool;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.concurrent.Semaphore;

/**
 * Created by zzt on 3/24/16.
 * <p>
 * Usage:
 * <li>Fixed instance number</li>
 * <li>instance can be shared with other</li>
 */
public class SharedPool<T> implements FixedPool<T> {

    private HashMap<T, Integer> map;
    private ArrayList<T> lists;
    private Semaphore semaphore;
    private final BitSet set;

    public SharedPool(int s, Class<T> classObj)
            throws IllegalAccessException, InstantiationException {
        map = new HashMap<>(s);
        lists = new ArrayList<>(s);
        semaphore = new Semaphore(s);
        set = new BitSet(s);
        for (int i = 0; i < s; i++) {
            T value = classObj.newInstance();
            lists.add(value);
            map.put(value, i);
        }
    }

    @Override
    public T checkOut() throws InterruptedException {
        semaphore.acquire();
        return getItem();
    }

    private T getItem() {
        int i;
        synchronized (set) {
            i = set.nextClearBit(0);
        }
        if (i < lists.size()) {
            return lists.get(i);
        }
        return null;
    }

    @Override
    public void checkIn(T t) {
        if (putItem(t)) {
            semaphore.release();
        }
    }

    private boolean putItem(T t) {
        Integer i = map.get(t);
        if (i == null) {
            return false;
        }
        synchronized (set) {
            set.set(i, true);
            return true;
        }
    }

    public int availableItem() {
        return semaphore.availablePermits();
    }
}
