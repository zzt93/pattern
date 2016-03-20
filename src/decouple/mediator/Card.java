package decouple.mediator;

/**
 * Created by zzt on 3/20/16.
 * <p>
 * Usage:
 */
public class Card {

    private char c;
    private Type color;

    public Card(char c, Type color) {
        this.c = c;
        this.color = color;
    }

    public char getC() {
        return c;
    }

    public Type getColor() {
        return color;
    }

    @Override
    public String toString() {
        return color.name() + ":" + c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (c != card.c) return false;
        return color == card.color;

    }

    @Override
    public int hashCode() {
        int result = (int) c;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
