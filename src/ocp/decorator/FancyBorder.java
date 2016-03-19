package ocp.decorator;

/**
 * Created by zzt on 3/19/16.
 * <p>
 * Usage:
 */
public class FancyBorder extends Border {

    public FancyBorder(UIComponent next) {
        super(next);
    }

    @Override
    public void draw() {
        System.out.println("draw fancy border");
        next.draw();
    }
}
