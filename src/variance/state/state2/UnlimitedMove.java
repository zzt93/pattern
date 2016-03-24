package variance.state.state2;

import variance.state.Game;
import variance.state.OutOfBoundsException;
import variance.state.Position;

import java.util.ArrayList;

/**
 * Created by zzt on 3/18/16.
 * <p>
 * Usage:
 */
public enum UnlimitedMove {

    UP() {
        @Override
        public void move() {
            System.out.println("moving up at " + p);
            if (p.getY() + 1 == Game.UP_LIMIT) {
                throw new OutOfBoundsException("at " + p + " moving up is out of bounds");
            }
            p.setY(p.getY() + 1);
        }


    },
    DOWN() {
        @Override
        public void move() {
            System.out.println("moving down at " + p);
            if (p.getY() - 1 == Game.LOW_LIMIT) {
                throw new OutOfBoundsException("at " + p + " moving down is out of bounds");
            }
            p.setY(p.getY() - 1);
        }

    },
    LEFT() {
        @Override
        public void move() {
            System.out.println("moving left at " + p);
            if (p.getX() - 1 == Game.LOW_LIMIT) {
                throw new OutOfBoundsException("at " + p + " moving left is out of bounds");
            }
            p.setX(p.getX() - 1);
        }
    },
    RIGHT() {
        @Override
        public void move() {
            System.out.println("moving right at " + p);
            if (p.getX() + 1 == Game.UP_LIMIT) {
                throw new OutOfBoundsException("at " + p + " moving right is out of bounds");
            }
            p.setX(p.getX() + 1);
        }
    },;

    Position p = Position.startPosition;

    public abstract void move();

}
