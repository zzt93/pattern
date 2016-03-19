package variance.state;

/**
 * Created by zzt on 3/18/16.
 * <p>
 * Usage:
 */
public class Position {

    public static Position startPosition = new Position(0, 0);

    int x;
    int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
