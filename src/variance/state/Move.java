package variance.state;

import java.util.ArrayList;

/**
 * Created by zzt on 3/18/16.
 * <p>
 * Usage:
 */
public enum Move {

    UP() {
        @Override
        public ArrayList<Move> move() {
            System.out.println("moving up at " + p);
            if (p.y + 1 == Game.UP_LIMIT) {
                throw new OutOfBoundsException("at " + p + " moving up is out of bounds");
            }
            p.y += 1;

            ArrayList<Move> res = new ArrayList<>();
            res.add(DOWN);
            testLeft(p.x, res);
            testRight(p.x, res);
            testUp(p.y, res);
            return res;
        }


    },
    DOWN() {
        @Override
        public ArrayList<Move> move() {
            System.out.println("moving down at " + p);
            if (p.y - 1 == Game.LOW_LIMIT) {
                throw new OutOfBoundsException("at " + p + " moving down is out of bounds");
            }
            p.y -= 1;

            ArrayList<Move> res = new ArrayList<>();
            res.add(UP);
            testLeft(p.x, res);
            testRight(p.x, res);
            testDown(p.y, res);
            return res;
        }

    },
    LEFT() {
        @Override
        public ArrayList<Move> move() {
            System.out.println("moving left at " + p);
            if (p.x - 1 == Game.LOW_LIMIT) {
                throw new OutOfBoundsException("at " + p + " moving left is out of bounds");
            }
            p.x -= 1;
            ArrayList<Move> res = new ArrayList<>();
            res.add(RIGHT);
            testLeft(p.x, res);
            testUp(p.y, res);
            testDown(p.y, res);
            return res;
        }
    },
    RIGHT() {
        @Override
        public ArrayList<Move> move() {
            System.out.println("moving right at " + p);
            if (p.x + 1 == Game.UP_LIMIT) {
                throw new OutOfBoundsException("at " + p + " moving right is out of bounds");
            }
            p.x += 1;
            ArrayList<Move> res = new ArrayList<>();
            res.add(LEFT);
            testRight(p.x, res);
            testUp(p.y, res);
            testDown(p.y, res);
            return res;
        }
    },;

    Position p = Position.startPosition;

    public abstract ArrayList<Move> move();


    private static void testUp(int y, ArrayList<Move> res) {
        if (y + 1 != Game.UP_LIMIT) {
            res.add(UP);
        }
    }

    private static void testRight(int x, ArrayList<Move> res) {
        if (x + 1 != Game.UP_LIMIT) {
            res.add(RIGHT);
        }
    }

    private static void testLeft(int x, ArrayList<Move> res) {
        if (x - 1 != Game.LOW_LIMIT) {
            res.add(LEFT);
        }
    }

    private static void testDown(int y, ArrayList<Move> res) {
        if (y - 1 != Game.LOW_LIMIT) {
            res.add(DOWN);
        }
    }
}
