package ocp.decorator;

/**
 * Created by zzt on 3/19/16.
 * <p>
 * Usage:
 */
public class VerticalBar extends ScrollBar {

    public VerticalBar(UIComponent next) {
        super(next);
    }

    @Override
    public void draw() {
        System.out.println("draw vertical bar");
        next.draw();
    }
}
