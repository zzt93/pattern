package ocp.decorator;

/**
 * Created by zzt on 3/19/16.
 * <p>
 * Usage:
 */
public class PlainBorder extends Border {

    public PlainBorder(UIComponent next) {
        super(next);
    }

    @Override
    public void draw() {
        System.out.println("draw plain border");
        next.draw();
    }
}
