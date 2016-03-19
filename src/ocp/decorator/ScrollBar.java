package ocp.decorator;

/**
 * Created by zzt on 3/19/16.
 * <p>
 * Usage:
 */
public class ScrollBar extends Decorator {

    public ScrollBar(UIComponent next) {
        super(next);
    }

    @Override
    public void draw() {
        System.out.println("draw scroll bar");
        next.draw();
    }
}
