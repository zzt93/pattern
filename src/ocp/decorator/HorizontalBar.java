package ocp.decorator;

/**
 * Created by zzt on 3/19/16.
 * <p>
 * Usage:
 */
public class HorizontalBar extends ScrollBar {

    public HorizontalBar(UIComponent next) {
        super(next);
    }

    @Override
    public void draw() {
        System.out.println("draw horizontal scroll bar");
        next.draw();
    }
}
