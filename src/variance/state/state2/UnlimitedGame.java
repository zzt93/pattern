package variance.state.state2;

import variance.state.Move;
import variance.state.OutOfBoundsException;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by zzt on 3/24/16.
 * <p>
 * Usage:
 */
public class UnlimitedGame {


    ArrayList<Move> moves;
    private Random random = new Random();

    public UnlimitedGame() {
        moves = new ArrayList<>();
        moves.add(Move.UP);
        moves.add(Move.DOWN);
        moves.add(Move.LEFT);
        moves.add(Move.RIGHT);
    }


    public void start() {
        for (int i = 0; i < 20; i++) {
            Move randomMove = getRandomMove();
            try {
                moves = randomMove.move();
            } catch (OutOfBoundsException e) {
                System.out.println(e.toString());
            }
        }
    }

    private Move getRandomMove() {
        int i = random.nextInt(moves.size());
        return moves.get(i);
    }

    public static void main(String[] args) {
        new UnlimitedGame().start();
    }
}
