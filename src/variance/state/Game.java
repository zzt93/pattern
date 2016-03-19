package variance.state;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by zzt on 3/18/16.
 * <p>
 * Usage:
 */
public class Game {

    public static final int UP_LIMIT = 3;
    public static final int LOW_LIMIT = -1;
    ArrayList<Move> moves;
    private Random random = new Random(22);

    public Game() {
        moves = new ArrayList<>();
        moves.add(Move.UP);
        moves.add(Move.RIGHT);
    }


    public void start() {
        for (int i = 0; i < 10; i++) {
            Move randomMove = getRandomMove();
            moves = randomMove.move();
        }
    }

    private Move getRandomMove() {
        int i = random.nextInt(moves.size());
        return moves.get(i);
    }

    public static void main(String[] args) {
        new Game().start();
    }
}
