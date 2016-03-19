package ocp.decorator;

/**
 * Created by zzt on 3/19/16.
 * <p>
 * Usage:
 */
public class Border extends Decorator {

    public Border(UIComponent next) {
        super(next);
    }

    @Override
    public void draw() {
        System.out.println("draw border");
        next.draw();
    }
}
