package ocp.decorator;

/**
 * Created by zzt on 3/19/16.
 * <p>
 * Usage:
 */
public class Tester {

    public static void main(String[] args) {
        // a text view with fancy border and horizontal bar
        TextView textView = new TextView();
        FancyBorder bordered = new FancyBorder(textView);
        HorizontalBar horizontalBar = new HorizontalBar(bordered);
        horizontalBar.draw();
    }
}
