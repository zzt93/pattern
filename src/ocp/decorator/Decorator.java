package ocp.decorator;

/**
 * Created by zzt on 3/19/16.
 * <p>
 * Usage:
 * Add new feature by adding decorator
 */
public class Decorator implements UIComponent {

    UIComponent next;

    public Decorator(UIComponent next) {
        this.next = next;
    }

    @Override
    public void draw() {
        next.draw();
    }
}
